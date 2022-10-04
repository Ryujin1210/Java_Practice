package NullContainer2;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainer2 extends JFrame {
	public NullContainer2() {
		setTitle("Null Container Sample 2");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130, 50); // 라벨 위치 지정
		la.setSize(200, 20); // 라벨 크기 지정
		c.add(la); // 라벨 컨텐트 팬에 부착

		for (int i = 1; i <= 9; i++) {
			JButton b = new JButton(Integer.toString(i)); // 버튼 생성 -> string 으로 변환
			b.setLocation(i * 15, i * 15); // 버튼의 위치 지정
			b.setSize(50, 20); // 버튼 크기 지정
			c.add(b); // 버튼 컨텐트 팬에 부착
		}

		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new NullContainer2();

	}

}
