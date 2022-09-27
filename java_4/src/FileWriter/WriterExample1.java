package FileWriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterExample1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;

		try {
			fout = new FileWriter("C:\\Temp\\test.txt"); // 파일과 연결된 출력 문자스트림 생성
			while (true) {
				String line = scanner.nextLine(); // 한줄 읽기 (line에는 줄바꿈 안들어감)
				if (line.length() == 0) // 빈 문자열 + Enter 입력 시 종료
					break;
				fout.write(line, 0, line.length()); // 읽은 문자열 파일에 저장
				fout.write("\r\n", 0, 2); // 다음행으로
			}
			fout.close();
			scanner.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}

	}

}
