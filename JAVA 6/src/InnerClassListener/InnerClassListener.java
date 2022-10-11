package InnerClassListener;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("내부 클래스로 리스너를 정의하는 방법");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane(); // 생략 가능
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);

		MyActionListener listener = new MyActionListener(); // 리스너객체로 만들어서 사용해도 같음
		btn.addActionListener(listener);
		// btn.addActionListener(new MyActionListener());

		setSize(350, 200);
		setVisible(true);

	}

	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			JButton b = (JButton) e.getSource();
			if (b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action"); // InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음

			setTitle(b.getText());
			// InnerClassListener.this.setTitle(b.getText());
			// 프레임 타이틀에 버튼 문자열출력
		}
	}

	public static void main(String[] args) {
		new InnerClassListener();

	}

}
