package MouseListenerAllEx;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");
	
	// extends MouseAdapter로 손쉽게 사용 가능
	//adapter도 가능하나 인터페이스 상속 이용
	public class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("Mouse Dragged (" + e.getX() + "," + e.getY() + ")");

		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("Mouse Moved (" + e.getX() + "," + e.getY() + ")");

		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("Mouse Pressed (" + e.getX() + "," + e.getY() + ")");

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("Mouse Realeased (" + e.getX() + "," + e.getY() + ")");

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);

		}

	}
	
	public MouseListenerAllEx() {
		setTitle("예제 10-9");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();  //기본 과 모션 둘다 해줘야함.
		c.addMouseListener(listener);   
		c.addMouseMotionListener(listener);
		
		c.add(la);
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MouseListenerAllEx();
	}

}
