package BufferIO2;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedExample2 {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\Temp\\tset2.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while ((c = fin.read()) != -1) { // 파일 데이터를 콘솔에 출력
				out.write(c);
			}
			// 파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine(); // <Enter 키 입력>
			out.flush(); // 버퍼에 남은 데이터 출력, 다 차지 않은 버퍼의 데이터를 강제로 출력 함
			out.close();
			fin.close();

		} catch (IOException e) {
			System.out.println("오류 입니다.");
		}

	}

}
