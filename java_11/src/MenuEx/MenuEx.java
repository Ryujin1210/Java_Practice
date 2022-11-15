package MenuEx;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	public MenuEx() {
		setTitle("menu만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		createMenu();
		setSize(250,200);
		setVisible(true);
		
	}
	
	//메뉴를 만들어 프레임에 삽입하는 함수
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		JMenu editMenu = new JMenu("Edit");
		JMenu sourceMenu = new JMenu("Source");
		JMenu projectMenu = new JMenu("Project");
		JMenu runMenu = new JMenu("Run");
		
		//Screen 메뉴에 메뉴아이템 생성 후 삽입
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("Reshow"));
		screenMenu.addSeparator(); // 분리선 삽입
		screenMenu.add(new JMenuItem("Exit"));
		
		//메뉴바에 메뉴 삽입
		mb.add(screenMenu);
		mb.add(editMenu);
		mb.add(sourceMenu);
		mb.add(projectMenu);
		mb.add(runMenu);
		
		//메뉴바를 프레임에 부착
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new MenuEx();

	}

}
