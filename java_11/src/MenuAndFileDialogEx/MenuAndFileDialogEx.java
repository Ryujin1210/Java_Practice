package MenuAndFileDialogEx;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class MenuAndFileDialogEx extends JFrame {
	private JLabel imageLabel = new JLabel();
	public MenuAndFileDialogEx() {
		setTitle("파일 다이아로그");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(imageLabel);
		
		createMenu();
		setSize(350,200);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenuItem openItem = new JMenuItem("Open");
		fileMenu.add(openItem);
		
		openItem.addActionListener(new openActionListener());
		
		mb.add(fileMenu);
		setJMenuBar(mb);
		
	}
	
	class openActionListener implements ActionListener {
		private JFileChooser chooser;
		public openActionListener() {
			chooser = new JFileChooser();
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF 이미지","jpg","gif");
			chooser.setFileFilter(filter);
			
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) {
				JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.", "경고", JOptionPane.WARNING_MESSAGE);
				return;
			}
	
			String filePath = chooser.getSelectedFile().getPath();
			imageLabel.setIcon(new ImageIcon(filePath));
			pack();
		}
	}
	
	public static void main(String[] args) {
		new MenuAndFileDialogEx();
	}
	
}
