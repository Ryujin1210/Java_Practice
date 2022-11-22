package TimerThread2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import TimerThread.TimerThread;

public class TimerThread2 extends JFrame {
	public TimerThread2() {
		setTitle("타이머 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel("0");
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread th = new TimerThread(timerLabel);
		th.start();
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TimerThread2();
	}

}

class ThreadTimer extends Thread {
	int n = 0;
	@Override
	public void run() {
		super.run();
		while(true) {
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			}
			catch (InterruptedException e) {return;}
		}
	}
}


