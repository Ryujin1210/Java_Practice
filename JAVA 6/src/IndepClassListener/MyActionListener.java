package IndepClassListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource(); // e는 이벤트 객체 전달
		if (b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}

}
