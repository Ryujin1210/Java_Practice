package RamdaAnonymousClassListener;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class RamdaAnonymousClassListener extends JFrame {
	public RamdaAnonymousClassListener() {
		setTitle("익명 클래스로 정의 - 람다버전");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btn = new JButton("Action");

		btn.addActionListener(e -> {
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
			// setTitle(b.getText()); // 제목 수정
		});

		add(btn);
		setSize(350, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new RamdaAnonymousClassListener();

	}

}
