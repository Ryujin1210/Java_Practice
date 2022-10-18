package MouseListenerEx;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerEx extends JFrame {
	private JLabel la = new JLabel("Hello");  // 이너클래스에 할 경우 사용할 수 없기에 이곳에 작성
	
	// 이너클래스로 마우스 리스너 구현
	public class MyMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			int x = e.getX();   //event.get x좌표
			int y = e.getY(); 
			la.setLocation(x, y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

	
	public MouseListenerEx() { 
		setTitle("Mouse  이벤트 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		la.setSize(50, 20);
		la.setLocation(30,  30);
		
		c.add(la);
		c.addMouseListener(new MyMouseListener()); // 마우스 리스너 객체 생성하여 추가
		
		setSize(250, 250);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MouseListenerEx();

	}

}
