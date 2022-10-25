package CheckBoxItemEventEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxItemEventEx extends JFrame {
	private String[] names = {"사과", "배", "체리"};
	private JCheckBox[] fruits = new JCheckBox[3];
	private JLabel sumLabel; 
	
	public class MyItemListener implements ItemListener {
		private int sum = 0;
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem() == fruits[0]) 
					sum += 100;
				else if(e.getItem() == fruits[1])
					sum += 500;
				else
					sum += 20000;
			} else {
				if(e.getItem()== fruits[0])
					sum -= 100;
				else if(e.getItem() == fruits[1])
					sum -= 500;
				else
					sum -= 20000;
			}
			sumLabel.setText("햔제 " +  sum + "원 입니다.");
		}

	}
	
	public CheckBoxItemEventEx() {
		
		setTitle("예제 11-5");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		MyItemListener li = new MyItemListener();
		for(int i=0; i<fruits.length; i++) {
			fruits[i] = new JCheckBox(names[i]);
			fruits[i].addItemListener(li);
			c.add(fruits[i]);
		}
		
		sumLabel = new JLabel("현재 0원 입니다");
		c.add(sumLabel);
		
		setSize(250,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBoxItemEventEx();
	}

}
