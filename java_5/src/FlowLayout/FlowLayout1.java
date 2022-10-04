package FlowLayout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout1 extends JFrame {
	public FlowLayout1() {
		setTitle("FlowLayout sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // 왼쪽정렬, 수직30, 수평40
		c.add(new JButton("add"));
		c.add(new JButton("sub"));
		c.add(new JButton("mul"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayout1();

	}

}
