package GraphicsDrawImageEx;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsDrawImageEx extends JFrame {
	private MyPanel panel = new MyPanel();
	public GraphicsDrawImageEx() {
		setTitle("Apple logo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(panel);
		setSize(206, 245);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("images/apple.png");
		private Image img = icon.getImage();
		
		@Override
		public void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			g.drawImage(img,0,0,getWidth(),getHeight(),this);

		}
		
	}
	
	public static void main(String[] args) {
		new GraphicsDrawImageEx();
	}

}
