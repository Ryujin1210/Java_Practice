package BorderLayout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayout1 extends JFrame {
	public BorderLayout1() {
		setTitle("BorderLayout sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // JFrame 없어도 O

		Container c = getContentPane();

		c.setLayout(new BorderLayout(30, 20));
		c.add(new JButton("Calculate"), BorderLayout.CENTER);
		c.add(new JButton("add"), BorderLayout.NORTH);
		c.add(new JButton("sub"), BorderLayout.SOUTH);
		c.add(new JButton("mul"), BorderLayout.EAST);
		c.add(new JButton("div"), BorderLayout.WEST);

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayout1();
	}

}
