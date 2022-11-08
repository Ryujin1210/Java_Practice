package GraphicDrawLineMouseEx;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicDrawLineMouseEx extends JFrame{
	private MyPanel panel = new MyPanel();
	public GraphicDrawLineMouseEx() {
		setTitle("drawing Line by Mouse 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(300, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GraphicDrawLineMouseEx();
	}
	
	class MyPanel extends JPanel{
		private Vector<Point>vStart = new Vector<Point>();
		private Vector<Point>vEnd = new Vector<Point>();
		public MyPanel() {
			addMouseListener(new MouseAdapter() {

				@Override
				public void mousePressed(MouseEvent e) {
					super.mousePressed(e);
					Point startP = e.getPoint();
					vEnd.add(startP);
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					super.mouseReleased(e);
					Point endP = e.getPoint();
					vEnd.add(endP);
					repaint();
				}
				
			});
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i=0; i<vStart.size(); i++) {
			Point s = vStart.elementAt(i);
			Point e = vEnd.elementAt(i);
			g.drawLine((int)s.getX(), (int)s.getY(),(int)e.getX(), (int)e.getY());
			}
		}
	}
}

