package KeyCodeEx;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel(); // 빈 라벨 컴포넌트 
	
	public class MyKeyListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			super.keyPressed(e);
			
			la.setText(KeyEvent.getKeyText(e.getKeyCode())+" 키가 입력되었습니다.");
			Container contentPane = (Container)e.getSource(); 
			
			 if(e.getKeyChar() == '%')
				 contentPane.setBackground(Color.YELLOW);
			 else if(e.getKeyCode() == KeyEvent.VK_F1)
				 contentPane.setBackground(Color.GREEN);
		}
		
	}

	public KeyCodeEx() {
		setTitle("Key Code 예제: F1키:초록색, % 키 노란색");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.addKeyListener(new MyKeyListener());  //focus를 지정해 주어야 컨텐트 팬이 입력 가능
		c.add(la);
		setSize(300, 300);
		setVisible(true);
		
		//focus 지정
		c.setFocusable(true);
		c.requestFocus();
	}
	
	
	public static void main(String[] args) {
		new KeyCodeEx();

	}

}
