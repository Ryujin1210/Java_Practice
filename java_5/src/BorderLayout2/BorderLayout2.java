package BorderLayout2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout2 extends JFrame {
	public BorderLayout2() {
		setTitle("BorderLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new BorderLayout(50, 50));
		c.setBackground(Color.BLUE);
		c.add(new JButton("인사하기"), BorderLayout.CENTER);
		c.add(new JButton("도망가기"), BorderLayout.EAST);
		c.add(new JButton("춤추기"), BorderLayout.SOUTH);
		c.add(new JButton("노래하기"), BorderLayout.NORTH);
		c.add(new JButton("환영하기"), BorderLayout.WEST);

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayout2();
	}

}
