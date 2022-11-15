package DialogEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class Codialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");
	public Codialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		okButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		setSize(200,100);
		
	}
	
	
}

public class MyDialog extends JDialog {
	private Codialog dialog;
	public MyDialog() {
		setTitle("Dialog Ex");
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		Container c = getContentPane();
		
		JButton btn = new JButton("Show Dialog");
		c.add(btn);
		
		dialog = new Codialog(this, getTitle());
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
		});
		
		setSize(250,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyDialog();
	}

}
