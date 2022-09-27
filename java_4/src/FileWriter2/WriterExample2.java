package FileWriter2;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriterExample2 {

	public static void main(String[] args) {
		byte b[] = { 7, 51, 3, 4, -1, 24 };
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Temp\\test.out");
			for (int i = 0; i < b.length; i++)
				fout.write(b[i]);
			fout.close();
		} catch (IOException e) {
			System.out.println("저장에 실패했습니다. 경로를 확인하여 주세요.");
			return;
		}
		System.out.println("C:\\Temp\\test.out을 저장하였습니다.");
	}

}
