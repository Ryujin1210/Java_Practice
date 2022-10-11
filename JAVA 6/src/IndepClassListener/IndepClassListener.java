package IndepClassListener;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("독립된 클래스로 이벤트 리스너 정의");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btn = new JButton("Action");

		btn.addActionListener(new MyActionListener()); // 버튼에 이벤트 처리넣어줌

		add(btn);
		setSize(350, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();

	}

}
