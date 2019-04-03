package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fortune_cookie implements ActionListener {
	public void showButton(){
	   JFrame frame = new JFrame();
	   JButton button = new JButton();
	   button.addActionListener(this);
	   frame.setVisible(true);
	   frame.add(button);
	   frame.pack();
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null,"perhaps");
		}
		else if(rand == 1) {
			JOptionPane.showMessageDialog(null,"E  X  P  A  N  D       D  O  N  G");
		}
		else if(rand == 2) {
			JOptionPane.showMessageDialog(null,"T I M E  F O R   A   C R U S A D E   M Y   B R O T H E R S");
		}
		else if(rand == 3) {
			JOptionPane.showMessageDialog(null,"A L L    T H O T T S   M U S T    B E    C R O N C H E D!");
		}
	}
	}

