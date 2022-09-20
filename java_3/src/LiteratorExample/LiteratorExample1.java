package LiteratorExample;

import java.util.Iterator;
import java.util.Vector;

public class LiteratorExample1 {

	public static void main(String[] args) {
		// Vector<Integer> v = new Vector<Integer>();
		var v = new Vector<Integer>();

		v.add(5);
		v.add(4);
		v.add(-1);

		v.add(2, 100);

		// 벡터 요소들의 합 iterator 사용
		int sum = 0;
		Iterator<Integer> it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println(sum);

		/*
		 * for 문 사용 for (int i = 0; i < v.size(); i++) { int num = v.get(i);
		 * 
		 * sum += num; System.out.println(" " + num); }
		 * System.out.println("벡터에 있는 요소의 합 = " + sum);
		 */

	}

}
