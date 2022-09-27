package BufferIO;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedExample1 {

	public static void main(String[] args) {
		try {
			BufferedOutputStream bout = new BufferedOutputStream(System.out, 20);
			FileReader fin = new FileReader("C:\\windows\\system.ini");
			int c;
			while ((c = fin.read()) != -1) {
				bout.write((char) c);
			}
			fin.close();
			bout.close();
		} catch (IOException e) {
			System.out.println("오류 ");
		}

	}

}
