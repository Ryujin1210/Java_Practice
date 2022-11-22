package ThreadInterruptEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadInterruptEx extends JFrame {
	private Thread th;
	public ThreadInterruptEx() {
		setTitle("THREAD INTERRUPT");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel timerLabel = new JLabel("0");
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		th = new Thread(runnable);
		th.start();
		
		c.add(timerLabel);
		JButton btn = new JButton("Killer Timer");
		c.add(btn);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				btn.setEnabled(false);
			}
		});
		
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ThreadInterruptEx();
		
	}
}

class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
		super();
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		int n = 0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				return;
			}
		}
		
	}
}
