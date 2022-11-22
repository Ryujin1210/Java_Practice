package MenuAndColorChooserEx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

public class MenuAndColorChooserEx extends JFrame {
	private JLabel label = new JLabel("Hello");
	
	public MenuAndColorChooserEx() {
		setTitle("JColorChooser");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		label.setFont(new Font("Ravie", Font.ITALIC, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		c.add(label, BorderLayout.CENTER);
		createMenu();
		setSize(250, 200);
		setVisible(true);
	}
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu textMenu = new JMenu("Text");
		JMenuItem colorMenuItem = new JMenuItem("Color");
		
		// Color 메뉴아이템이 선택될 때 실행되는 Action 리스너 등록
		colorMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if(cmd.equals("Color")) { // Color 메뉴 아이템의 경우
					Color color = JColorChooser.showDialog(null, "색상 다이얼로그", Color.YELLOW);
					if(color != null) {
						label.setForeground(color);
					}
				}
				
			}
		});
		
		textMenu.add(colorMenuItem);
		mb.add(textMenu);
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		new MenuAndColorChooserEx();
	}

}
