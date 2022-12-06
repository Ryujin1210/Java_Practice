import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Ex2 {
	public static void main(String[] args) {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/sampledb?serverTimezone=Asia/Seoul";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("데이터베이스 연결 중....");
			con = DriverManager.getConnection(url, "root", "shinhan");
			System.out.println("DB 연결 성공");

			String sql = "SELECT * FROM student;";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			printData(rs, "id", "name", "dept");
			rs = stmt.executeQuery("SELECT name, id, dept FROM student WHERE name='김민재'");
			printData(rs, "id", "name", "dept");

			con.close();
			stmt.close();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("SQL 실행 에러");
		}
	}

	private static void printData(ResultSet rs, String col1, String col2, String col3) throws SQLException {
		System.out.println("-----------------------------------------");
		while (rs.next()) {
			if (!col1.equals(""))
				System.out.print(rs.getString("id"));
			if ((!col2.equals("")))
				System.out.print("\t|\t" + rs.getString("name"));
			if ((!col3.equals("")))
				System.out.println("\t|\t" + rs.getString("dept"));
			else
				System.out.println();
		}
	}
}