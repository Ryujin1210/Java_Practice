package IndepClassListener;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("������ Ŭ������ �̺�Ʈ ������ ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btn = new JButton("Action");

		btn.addActionListener(new MyActionListener()); // ��ư�� �̺�Ʈ ó���־���

		add(btn);
		setSize(350, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new IndepClassListener();

	}

}
