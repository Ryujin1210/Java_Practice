package FileLists;

import java.io.File;

public class FileExample1 {

	public static void main(String[] args) {
		File file = new File("C:\\Windows");
		File[] subfiles = file.listFiles();

		for (File f : subfiles) // 향상된 for 문 subfiles 배열을 f에 담아서 반복하여 출력
			if (f.isDirectory())
				System.out.printf("dir : %s\n", f);
			else
				System.out.printf("file : %s(%d bytes)\n", f, f.length());
	}

}
// https://peonyf.tistory.com/8 향상된 for 문 참고