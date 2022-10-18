package MouserAdapterEx;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterEx extends JFrame {
	private JLabel la = new JLabel("Hello");  // 이너클래스에 할 경우 사용할 수 없기에 이곳에 작성
	
	// 어댑터상속받아 마우스 리스너  구현
	public class MyMouseListener extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x, y);
		}
	}

	
	public MouseAdapterEx() { 
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
		new MouseAdapterEx();

	}

}
