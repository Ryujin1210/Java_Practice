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
			System.out.println("�Է� ����");
		}
	}

	// �ý��� ���� �ڵ�ó��
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
