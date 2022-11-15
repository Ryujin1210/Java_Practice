package PopUpDialog;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class OptionPaneEx extends JFrame {
	public OptionPaneEx() {
		setTitle("옵션 팬 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new MyPanel(), BorderLayout.NORTH);
		setSize(500,200);
		setVisible(true);
	}
	
	class MyPanel extends Panel{
		private JButton inputBtn = new JButton("Input Name");
		private JButton confirmBtn = new JButton("Confirm");
		private JButton messageBtn = new JButton("Message");
		private JTextField tf = new JTextField(10);
		
		public MyPanel() {
			setBackground(Color.LIGHT_GRAY);
			add(inputBtn);
			add(confirmBtn);
			add(messageBtn);
			add(tf);
			
			inputBtn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름을 입력하세요.");
					if(name != null)
						tf.setText(name); // 입력한 문자열 텍스트 필드에 출력
				}
			});
		}
	}
	

	public static void main(String[] args) {
		new OptionPaneEx();
	}

}
