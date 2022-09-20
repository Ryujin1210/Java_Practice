package HashMapExample;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample1 {

	public static void main(String[] args) {
		// HashMapl<String,String> dic = new HashMap<String,String>();
		// HashMap컬렉션 생성
		var dic = new HashMap<String, String>();

		// 3개의 (key,value쌍 dic에 저장)
		dic.put("baby", "애기");
		dic.put("Baby", "애기");
		dic.put("love", "사랑");
		dic.put("Love", "사랑");
		dic.put("apple", "사과");
		dic.put("Apple", "사과");

		// 영어 단어를 입력받아 한글 단어 검색 "exit" 로 종료
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("찾고 싶은 단어를 입력하세요 : ");
			String eng = scanner.next();

			if (eng.equals("exit")) {
				System.out.println("종료합니다!");
				break;
			}

			String kor = dic.get(eng);
			if (kor == null)
				System.out.println(eng + "없는 단어입니다!");
			else
				System.out.println(kor);
		}
		scanner.close();
	}
}
