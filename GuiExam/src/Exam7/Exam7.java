package Exam7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exam7 extends JFrame {
	public Exam7() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.add(new SouthPanel(), BorderLayout.SOUTH);
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);

		setSize(300, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Exam7();
	}

}

class SouthPanel extends JPanel {
	public SouthPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(Color.YELLOW);
		add(new JLabel("계산결과"));
		add(new JTextField(15)); // 15자리
	}
}

class NorthPanel extends JPanel {
	public NorthPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(Color.LIGHT_GRAY);
		add(new JLabel("수식입력"));
		add(new JTextField(20));
	}
}

class CenterPanel extends JPanel {
	JButton b[] = { new JButton("+"), new JButton("-"), new JButton("x"), new JButton("/") };

	public CenterPanel() {
		setLayout(new GridLayout(4, 4, 5, 5));

		for (int i = 0; i < 10; i++) {
			JButton b = new JButton(Integer.toString(i));
			add(b);
		}
		add(new JButton("CE"));
		add(new JButton("계산"));

		for (int i = 0; i < b.length; i++) {
			b[i].setBackground(Color.CYAN);
			add(b[i]);
		}

	}
}