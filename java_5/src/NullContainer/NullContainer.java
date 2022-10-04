package NullContainer;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NullContainer extends JFrame {
	public NullContainer() {
		setTitle("배지 관리자가 없은 컨테이너");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);

		JButton clickButton = new JButton("Click");
		clickButton.setSize(100, 50); // 크기 지정
		clickButton.setLocation(50, 50); // 절대 위치 지정
		c.add(clickButton);

		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new NullContainer();
	}

}
