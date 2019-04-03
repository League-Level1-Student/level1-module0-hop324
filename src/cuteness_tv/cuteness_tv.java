package cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import javax.swing.JLabel;

public class cuteness_tv implements ActionListener {	
	
	
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	
	
	public void createUI() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.setVisible(true);
	button1.setText("Video of cute ducks");
	button1.addActionListener((ActionListener) this);
	button2.setText("Video of cute frogs");
	button2.addActionListener((ActionListener) this);
	button3.setText("Video of cute, fluffy unicorns");
	button3.addActionListener((ActionListener) this);
	panel.add(button1); panel.add(button2); panel.add(button3);
	frame.add(panel);
	//frame.add(button1); frame.add(button2); frame.add(button3);
	frame.pack();

	}
	public static void main(String [] args) {
		new cuteness_tv().createUI();
	}
	public void actionPerformed(ActionEvent arg0) {

		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == button1) {
		showDucks();	
		}
		else if(buttonPressed == button2)
		{
			showFrog();
		}
		else if (buttonPressed == button3) {
			showFluffyUnicorns();
		}
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}


}
