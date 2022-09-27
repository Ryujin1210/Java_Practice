package FileEx;

import java.io.File;

public class FileEx {

	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----");

		File[] subFiles = dir.listFiles(); // 디렉터리에 포함된 파일과 디렉터리 이름의 리스트

		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified(); // 마지막으로 수정된 시간

			System.out.print(f.getName());
			System.out.print("\t파일\t크기: " + f.length()); // 파일 크기
			System.out.printf("\t수정한 시간: %tb %td %ta %tT\n", t, t, t, t); // 포맷 출력
		}
	}

	public static void main(String[] args) {
		File f1 = new File("C:\\windows\\system.ini");
		System.out.println(f1.getPath());
		System.out.println(f1.getParent());
		System.out.println(f1.getName());
		String res = "";

		if (f1.isFile())
			res = "파일";
		else
			res = "디렉터리";
		System.out.println(f1.getPath() + "은 " + res + "입니다");

		File f2 = new File("C:\\Temp\\java_sample");
		if (!f2.exists()) {
			f2.mkdir();
		}
		listDirectory(new File("C:\\Temp"));
		f2.renameTo(new File("C:\\Temp\\javasample"));
		listDirectory(new File("c:\\Temp"));
	}

}
