package Exam4;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam4 extends JFrame {
	public Exam4() {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));

		JButton[] btn = new JButton[10];
		Color[] color = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE.brighter(),
				Color.BLUE.darker(), Color.MAGENTA, Color.GRAY, Color.PINK.brighter(), Color.LIGHT_GRAY };

		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setBackground(color[i]);
			btn[i].setSize(50, 150);
			c.add(btn[i]);
		}

		setSize(500, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new Exam4();
	}

}
