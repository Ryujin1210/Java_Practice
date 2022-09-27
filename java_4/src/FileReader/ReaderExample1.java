package FileReader;

import java.io.FileReader;
import java.io.IOException;

public class ReaderExample1 {

	public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("C:\\little_prince.txt");
			int c;

			while ((c = fin.read()) != -1) {
				System.out.print((char) c);
				}
				fin.close();
			} catch (IOException e) {
			System.out.println("입력 오류");
		}
	}

	// 시스템 오류 자동처리
	/*
	 * public static void main(String[] args) throws IOException { FileReader fin =
	 * new FileReader("C:\\little_prince.txt");
	 * 
	 * int c;
	 * 
	 * while ((c = fin.read()) != -1) { System.out.print((char) c); }
	 * 
	 * fin.close(); }
	 */

}
