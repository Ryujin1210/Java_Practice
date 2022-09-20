package VectorExample;

import java.util.Vector;

public class VectorExample1 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();

		// 벡터에 요소 삽입
		v.add(5);
		v.add(4);
		v.add(-1);

		// v.add(index,element) 인덱스 위치와 값 선택 삽입 가능
		v.add(2, 100);
		v.add(1, 500);

		System.out.println("요소의 크기 = : " + v.size());
		System.out.println("벡터의 용량 = : " + v.capacity());

		System.out.println("벡터의 2번째 요소 값 : " + v.get(2));
		System.out.println("벡터의 2번째 요소 값 : " + v.elementAt(2));

		// 벡터 요소들의 합
		int sum = 0;
		for (int i = 0; i < v.size(); i++) {
			int num = v.get(i);

			sum += num;
			System.out.println(" " + num);
		}
		System.out.println("벡터에 있는 요소의 합 = " + sum);

		// 벡터에 요소 삭제
		int reNum = v.remove(1);
		System.out.println(reNum);
	}
}