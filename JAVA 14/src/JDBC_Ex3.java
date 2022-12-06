
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Ex3 {
	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/sampledb?serverTimezone=Asia/Seoul";
		Connection con = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("데이터베이스 연결 중...");
			con = DriverManager.getConnection(url, "root", "shinhan");
			System.out.println("DB 연결 완료");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("SQL 실행 에러1");
		}
		return con;
	}

	public static void printTable(PreparedStatement pstmt, Connection con) throws SQLException {
		try {
			String sql = "SELECT * FROM student;";
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			System.out.println();
			System.out.println("----------------- 레코드 출력 -------------------");
			while (rs.next()) {
				System.out.print(rs.getString("id"));
				System.out.print("\t|\t" + rs.getString("name"));
				System.out.println("\t|\t" + rs.getString("dept"));
			}
		} catch (SQLException e) {
			System.out.println("SQL 실행 에러2");
		}

	}

	public static void main(String[] args) {
		PreparedStatement pstmt = null;
		String sql;
		try {
			Connection con = makeConnection();

			sql = "INSERT INTO student(id, name, dept) VALUES('2023123', '홍길동', '소프트웨어융합')";
			pstmt = con.prepareStatement(sql);
			int result = pstmt.executeUpdate();
			System.out.println("결과 = " + result);
			printTable(pstmt, con);

			sql = "UPDATE student SET id='1234567' WHERE name='홍길동'";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			printTable(pstmt, con);

			sql = "DELETE FROM student WHERE name='홍길동'";
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			printTable(pstmt, con);

			pstmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println("SQL 실행 에러3");
		}

	}
}