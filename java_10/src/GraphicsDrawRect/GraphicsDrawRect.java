package GraphicsDrawRect;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawRect extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public GraphicsDrawRect() {
		setTitle("drawLine 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}	
	
	class MyPanel extends JPanel{
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.GREEN);
			g.drawArc(10, 10, 80, 80, 360, 270);
			g.fillArc(70, 70, 80, 80, 90, 270); // 칠해진 도형
			g.setColor(Color.BLUE);
			int []x = {80,40,80,120};
			int []y = {40,120,200,120};
			g.drawPolygon(x,y,4);
			g.setColor(Color.red);
			g.fillOval(10, 150, 50, 50);
		}
		
	}
	public static void main(String[] args) {
		new GraphicsDrawRect();
	}

}
