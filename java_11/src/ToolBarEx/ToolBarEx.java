package ToolBarEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ToolBarEx extends JFrame {
	private Container c;
	public ToolBarEx() {
		setTitle("툴바 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c = getContentPane();
		CreateToolBar();
		setSize(400,200);
		setVisible(true);
	}
	
	private void CreateToolBar() {
		JToolBar toolBar = new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		//툴바에 메뉴로 사용할 컴포넌트 삽입
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("images/open.jpg")));
		toolBar.addSeparator();
		
		//save 버튼에 툴팁 생성하여 넣기
		JButton saveBtn = new JButton(new ImageIcon("images/save.jpg"));
		saveBtn.setToolTipText("파일을 저장합니다!");
		toolBar.add(saveBtn);
		
		toolBar.add(new JLabel("Search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		
		toolBar.add(combo);
		//툴바를 컨텐츠 팬에 부착
		c.add(toolBar, BorderLayout.NORTH);
		//핸들 사용 못하게 
		toolBar.setFloatable(false);
	}

	public static void main(String[] args) {
		new ToolBarEx();
	}

}
