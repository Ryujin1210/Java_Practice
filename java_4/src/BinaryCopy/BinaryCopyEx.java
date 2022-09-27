package BinaryCopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryCopyEx {

	public static void main(String[] args) {
		File src = new File("C:\\windows\\Web\\Wallpaper\\Windows\\img0");
		File dest = new File("C:\\Temp\\copyimg.jpg");
		int c;

		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while ((c = fi.read()) != -1) {
				fo.write((byte) c);
			}
			fi.close();
			fo.close();
			System.out.println("복사 완료");
		} catch (IOException e) {
			System.out.println("복사 실패");
		}

	}

}
