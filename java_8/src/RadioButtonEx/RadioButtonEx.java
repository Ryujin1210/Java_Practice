package RadioButtonEx;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class RadioButtonEx extends JFrame {
	public class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.DESELECTED)
				return;
			if(radio[0].isSelected())
				imageJLabel.setIcon(image[0]);
			else if(radio[1].isSelected())
				imageJLabel.setIcon(image[1]);
			else
				imageJLabel.setIcon(image[2]);
		}

	}

	private String[] text = {"사과", "배", "체리"};
	private ImageIcon[] image = {new ImageIcon("images/apple.jpg"),
								 new ImageIcon("images/pear.jpg"),
								 new ImageIcon("images/cherry.jpg")};
	private JRadioButton[] radio = new JRadioButton[3];
	private JLabel imageJLabel = new JLabel();

	public RadioButtonEx() {
	setTitle("예제 11-7");	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(new BorderLayout());
	
	JPanel radioPanel =  new JPanel();
	ButtonGroup g = new ButtonGroup();
	
	for(int i=0 ; i < image.length; i++) {
		radio[i] = new JRadioButton(text[i]);
		radio[i].addItemListener(new MyItemListener());
		g.add(radio[i]);
		radioPanel.add(radio[i]);	
	}
	c.add(radioPanel, BorderLayout.NORTH);
	c.add(imageJLabel, BorderLayout.CENTER);
	imageJLabel.setHorizontalAlignment(SwingConstants.CENTER);
	
	setSize(250,200);
	setVisible(true);
	}
	
	public static void main(String[] args) {
		new RadioButtonEx();
	}

}
