package JFrame3;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrame3 extends JFrame {
	public JFrame3() {
		setTitle("ContentPane과 JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 닫으면 프로그램 종료

		Container contentPane = getContentPane(); // 컨텐트 팬 생성
		contentPane.setBackground(Color.blue.darker()); // Color(255,255,0) rgb 지정 가능
		contentPane.setLayout(new FlowLayout()); // 배치관리자 flowlayout

		contentPane.add(new JButton("Ok")); // 버튼 달기
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));

		setSize(300, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JFrame3();
	}

}
