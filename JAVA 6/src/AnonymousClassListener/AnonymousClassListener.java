package AnonymousClassListener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		setTitle("익명 클래스로 정의");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btn = new JButton("Action");

		btn.addActionListener(new ActionListener() {

			@Override // 클래스의 이름이 없음 ㅡ> 익명클래스
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("Action"))
					b.setText("액션");
				else
					b.setText("Action");
				// setTitle(b.getText()); // 제목 수정
			}
		});

		add(btn);
		setSize(350, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AnonymousClassListener();

	}

}
