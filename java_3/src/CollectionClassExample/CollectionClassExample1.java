package CollectionClassExample;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionClassExample1 {

	public static void main(String[] args) {
		// LinkedList<String> myList = new LinkedList<String>();
		var myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		System.out.println(myList);

		Collections.sort(myList); // 요소 정렬
		System.out.println(myList); // 정렬된 요소 출력

		Collections.reverse(myList); // 요소의 순서를 반대로
		System.out.println(myList); // 요소 출력

		int index = Collections.binarySearch(myList, "아바타") + 1;
		System.out.println("아바타는 " + index + "번째 요소입니다.");
	}

}
