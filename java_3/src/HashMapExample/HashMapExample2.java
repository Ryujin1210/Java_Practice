package HashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample2 {

	public static void main(String[] args) {
		// 사용자 이름과 점수를 기록하는 HashMap 컬렉션 생성
		// HashMap<String, Integer> scoreMap =
		// new HashMap<String, Integer>();
		var scoreMap = new HashMap<String, Integer>();

		// 5 개의 점수 저장
		scoreMap.put("김성동", 97);
		scoreMap.put("황기태", 88);
		scoreMap.put("김남윤", 98);
		scoreMap.put("이재문", 70);
		scoreMap.put("한원선", 99);

		System.out.println("HashMap의 요소 개수 :" + scoreMap.size());

		// 모든 사람의 점수 출력
		// scoreMap에 들어 있는 모든 (key, value) 쌍 출력
		// key 문자열을 가진 집합 Set 컬렉션 리턴
		// 키 값들만 따로 set 객체로 변환 후 iterator를 사용
		Set<String> keys = scoreMap.keySet();

		// Set에 있는 모든 key를 순서대로 접근할 수 있는 Iterator 리턴
		Iterator<String> it = keys.iterator();

		while (it.hasNext()) {
			String name = it.next(); // 키(학생 이름)
			int score = scoreMap.get(name); // 점수
			System.out.println(name + " : " + score);
		}

	}

}
