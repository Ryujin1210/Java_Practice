package paintJPanelEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import paintJPanelEx.paintJPanelEx.MyPanel;

public class paintJPanelEx3 extends JFrame{
	private MyPanel panel = new MyPanel();
	public paintJPanelEx3() {
		setTitle("JPanel의 paintComponent() 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new MyPanel());
		setSize(250,220);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.GRAY);
			g.drawRect(10, 10, 50, 50);
			g.drawRect(50, 50, 50, 50);
			g.setColor(Color.GREEN);
			g.drawRect(90, 90, 50, 50);
			
		}
	}
	
	public static void main(String[] args) {
		new paintJPanelEx3();
	}

}
