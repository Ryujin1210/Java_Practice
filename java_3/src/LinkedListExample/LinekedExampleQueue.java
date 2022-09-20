package LinkedListExample;

import java.util.LinkedList;

public class LinekedExampleQueue {

	public static void main(String[] args) {
		// LinkedList<String> queue = new LinkedList<String>();
		var queue = new LinkedList<String>();
		queue.offer("토끼");
		queue.offer("사슴");
		queue.offer("거북이");
		queue.offer("고양이");

		while (!queue.isEmpty()) {
			// 값을 꺼내오며 삭제함
			String str = queue.poll();
			System.out.println(str);
		}

	}

}
