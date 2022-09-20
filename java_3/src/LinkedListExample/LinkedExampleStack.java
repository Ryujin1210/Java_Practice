package LinkedListExample;

import java.util.LinkedList;

public class LinkedExampleStack {

	public static void main(String[] args) {
		// LinkedList<Integer> stack = new LinkedList<Integer>();
		var stack = new LinkedList<Integer>();
		stack.addLast(12); // 스택에 데이터를 저장(push)
		stack.addLast(59);
		stack.addLast(7);

		while (!stack.isEmpty()) {
			Integer num = stack.removeLast();
			System.out.println(num);
			// 출력 순서 바뀜 stack 이므로
		}

	}
}
