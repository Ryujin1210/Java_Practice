package FileWriter3;

import java.io.FileInputStream;
import java.io.IOException;

public class WriterExample3 {

	public static void main(String[] args) {
		byte b[] = new byte[6];
		try {
			FileInputStream fin = new FileInputStream("C:\\Temp\\test.out");
			int n = 0, c;
			while ((c = fin.read()) != -1) {
				b[n] = (byte) c;
				n++;
			}
			System.out.println("C:\\Temp\\test.out의 배열을 출력합니다.");
			for (int i = 0; i < b.length; i++)
				System.out.print(b[i] + " ");
			System.out.println();
			fin.close();
		} catch (IOException e) {
			System.out.println("오류 경로를 확인하시오.");
		}

	}

}
