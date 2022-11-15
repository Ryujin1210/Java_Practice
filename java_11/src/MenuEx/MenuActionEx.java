package MenuEx;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuActionEx extends JFrame {
	private JLabel imgLabel = new JLabel();
	public MenuActionEx() {
		setTitle("Menu에 Action리스너 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createMenu();
		Container c = getContentPane();
		c.add(imgLabel, BorderLayout.CENTER);
		setSize(250,200);
		setVisible(true);
	}
	
	
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenuItem[] menuItem = new JMenuItem[4];
		String[] itemTitle = {"Load", "Hide", "Reshow", "Exit"};
		JMenu screenMenu = new JMenu("Screen");
		
		for(int i =0; i<menuItem.length; i++) {
			menuItem[i] = new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//사용자가 선택한 메뉴 아이템의 문자열 리턴
					//String cmd = e.getActionCommand();
					JMenuItem cmd = (JMenuItem) e.getSource();
					
					switch(cmd.getText()) {
					case "Load" :
						if(imgLabel.getIcon() != null)
							return;
						imgLabel.setIcon(new ImageIcon("images/img.jpg"));
						break;
					case "Hide" : 
						imgLabel.setVisible(false);
						break;
					case "Reshow" :
						imgLabel.setVisible(true);
						break;
					case "Exit" :
						System.exit(0);
						break;
					}
				}
			});
			screenMenu.add(menuItem[i]);
		}
		
		mb.add(screenMenu); //메뉴바에 스크린 메뉴 삽입
		setJMenuBar(mb);	// 메뉴바를 프레임에 부착
	}
		

	public static void main(String[] args) {
		new MenuActionEx();

	}

}
