package FileCopy;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TextCopyExample {

	public static void main(String[] args) {
		File src = new File("C:\\windows\\system.ini");
		File dest = new File("C:\\Temp\\abc.txt");
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while ((c = fr.read()) != -1) {
				fw.write((char) c);
			}
			fr.close();
			fw.close();
			System.out.println(src.getPath() + "을 " + dest.getPath() + "로 복사 하였습니다.");
		} catch (Exception e) {
			System.out.println("복사 오류 ");
		}

	}

}
