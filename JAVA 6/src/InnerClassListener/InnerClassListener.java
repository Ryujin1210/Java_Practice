package InnerClassListener;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame {
	public InnerClassListener() {
		setTitle("���� Ŭ������ �����ʸ� �����ϴ� ���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane(); // ���� ����
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		c.add(btn);

		MyActionListener listener = new MyActionListener(); // �����ʰ�ü�� ���� ����ص� ����
		btn.addActionListener(listener);
		// btn.addActionListener(new MyActionListener());

		setSize(350, 200);
		setVisible(true);

	}

	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			JButton b = (JButton) e.getSource();
			if (b.getText().equals("Action"))
				b.setText("�׼�");
			else
				b.setText("Action"); // InnerClassListener�� ����� JFrame�� ����� ȣ���� �� ����

			setTitle(b.getText());
			// InnerClassListener.this.setTitle(b.getText());
			// ������ Ÿ��Ʋ�� ��ư ���ڿ����
		}
	}

	public static void main(String[] args) {
		new InnerClassListener();

	}

}
