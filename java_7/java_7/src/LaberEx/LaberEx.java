package LaberEx;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LaberEx extends JFrame {
	
	public LaberEx() {
		setTitle("레이블 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel textLabel = new JLabel("I love you");
		
		//이미지 레이블 생성
		ImageIcon beauty = new ImageIcon("images/beauty.jpg"); //이미지 로딩
		JLabel imageLabel = new JLabel(beauty); // 레이블 생성
		
		//문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif"); // 이미지 로딩
		JLabel label = new JLabel("Call me If you want", normalIcon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		setSize(400, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LaberEx();
	}

}
