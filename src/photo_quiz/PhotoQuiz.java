package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		quizWindow.setSize(224, 225);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String image= "https://steamuserimages-a.akamaihd.net/ugc/911293473571708795/0A750C901F614882C1850DBB86F0718C8AE49517/";		// 3. use the "createImage()" method below to initialize your Component
		Component imageHolder = createImage(image);
		// 4. add the image to the quiz window
		quizWindow.add(imageHolder);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String perhaps = JOptionPane.showInputDialog("What is the cow saying?");
		// 7. print "CORRECT" if the user gave the right answer
		if(perhaps.equalsIgnoreCase("Perhaps")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(imageHolder);
		// 10. find another image and create it (might take more than one line
		// of code)
String image2 = "https://i.kym-cdn.com/photos/images/newsfeed/000/781/983/06d.png";
		Component imageHolder2 = createImage(image2);
quizWindow.add(imageHolder2);
		// 12. pack the quiz window
	quizWindow.pack();
		// 13. ask another question
String answer = JOptionPane.showInputDialog("What's being expanded?");
if(answer.equalsIgnoreCase("Dong")) {
	JOptionPane.showMessageDialog(null, "Correct");
}
else {
	JOptionPane.showMessageDialog(null, "Incorrect");
}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
