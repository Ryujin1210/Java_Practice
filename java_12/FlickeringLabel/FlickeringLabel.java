package FlickeringLabel;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLabel extends JFrame {
	public FlickeringLabel() {
		setTitle("깜빡이는 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		Flickering flabel = new Flickering("깜빡", 500);
		
		JLabel label = new JLabel("안 깜빡");
		
		Flickering flabel2 = new Flickering("여기도 깜빡", 300);
		
		c.add(flabel);
		c.add(label);
		c.add(flabel2);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlickeringLabel();
	}

}

class Flickering extends JLabel implements Runnable {
	private long delay;
	public Flickering(String text, long delay) {
		super(text);
		this.delay = delay;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		int n = 0;
		while(true) {
			if(n == 0)
				setBackground(Color.BLUE);
			else
				setBackground(Color.GREEN);
			if(n == 0)
				n = 1;
			else 
				n=0;
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
	
}
