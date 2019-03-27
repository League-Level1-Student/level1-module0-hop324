import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttonz implements ActionListener{
	//1.  declare all JComponents
	JFrame frame;
	JPanel panel;
	JButton button;
	//2.  call your createUI method (shown below)
	public static void main(String[] args){
		new Buttonz().createUI();
	}

	//3.  make a createUI() method (shown below)
	void createUI(){
	//4.  initialize all JComponents
		button = new JButton();
		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(100, 100);

	//5.  add them all together
		frame.add(panel);
		panel.add(button);
	//6.  add any listeners
		button.addActionListener(this);

	//7.  pack frame and setVisible

frame.pack();
frame.setVisible(true);
	}
	
	//8.  add "implements ActionListener" to the class declaration (shown above) 
	//9.  import ActionListener, then click on the name of the class and select "add unimplemented methods" (this will add the actionPerformed method shown below)
	public void actionPerformed(ActionEvent e){
		//check which button was pressed and do something (shown below)
		if(e.getSource() == button){
			System.out.println("Do something");
		}
 	}
}