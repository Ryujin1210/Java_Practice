package paintJPanelEx;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class paintJPanelEx2 extends JFrame{
	public paintJPanelEx2() {
		setTitle("JPanel paintComponent 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.GRAY);
				g.drawRect(10, 10, 50, 50);
				g.drawRect(50, 50, 50, 50);
				g.setColor(Color.GREEN);
				g.drawRect(90, 90, 50, 50);
			}
			
		});
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new paintJPanelEx2();
	}

}
