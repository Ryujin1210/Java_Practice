package TextFieldEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20);
			
	public TextFieldEx() {
		setTitle("텍스트 영역만들기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 엔터를 입력하시오"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText()+ "\n");
				t.setText("");
				
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new TextFieldEx();
	}

}
