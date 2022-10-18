package FlyingTextEx;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame {
	private JLabel la = new JLabel("Ryu~~");
	
	public class MyKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			
			switch(e.getKeyCode()) {
				case KeyEvent.VK_RIGHT:
					la.setLocation(la.getX() + 10, la.getY());
					break;
				case KeyEvent.VK_LEFT:
					la.setLocation(la.getX() - 10, la.getY());
					break;
				case KeyEvent.VK_UP:
					la.setLocation(la.getX(), la.getY() - 10);
					break;
				case KeyEvent.VK_DOWN:
					la.setLocation(la.getX(), la.getY() + 10);
					break;
			}
		}
		
	}

	
	public FlyingTextEx() {
		setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null); // 자유롭게 움직이기 위해 null로
		
		la.setLocation(50, 50);
		la.setSize(100, 20);
		c.addKeyListener(new MyKeyListener());
		
		c.add(la);
		setSize(300,  300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
		//content pane 에서 포커스를 잃은 경우 마우스로 다시 포커스 얻게 설정
		//익명클래스
		c.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			super.mouseClicked(e);
			Component comp = (Component)e.getSource();
			comp.setFocusable(true);
			comp.requestFocus();
		}
		
		});
	}

	public static void main(String[] args) {
		new FlyingTextEx();
	}

}
