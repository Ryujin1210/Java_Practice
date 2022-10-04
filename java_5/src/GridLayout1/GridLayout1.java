package GridLayout1;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayout1 extends JFrame {
	public GridLayout1() {
		setTitle("GridLayout Sample");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		GridLayout grid = new GridLayout(4, 2, 0, 5); // 4*2 격자 배치 관리자 생성
		// grid.setVgap(5); // 격자 사이 수직 간격 5픽셀

		Container c = getContentPane(); // grid 를 컨텐트팬의 배치관리자로 지정
		c.setLayout(grid);
		c.add(new JLabel(" 이름")); // 라벨 생성
		c.add(new JTextField("")); // 텍스트 필드 생성
		c.add(new JLabel(" 학번"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 학과"));
		c.add(new JTextField(""));
		c.add(new JLabel(" 과목"));
		c.add(new JTextField(""));

		setSize(300, 200);
		setVisible(true);

	}

	public static void main(String[] args) {
		new GridLayout1();
	}

}
