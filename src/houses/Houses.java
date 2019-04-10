package houses;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	 static Robot rob = new Robot();
 public static void main(String [] args) {
	 rob.penDown();
	 rob.hide();
	 rob.setPenColor(0, 100, 0);
	 rob.setSpeed(50);
	 String input = JOptionPane.showInputDialog("How tall?");
	 String input2 = JOptionPane.showInputDialog("What color? Blue, red, or green?");
	 house(input, input2);
	 
 }
 public static void house(String height, String color) {
	 int houseSize = 0;
	 if(color.equalsIgnoreCase("blue")) {rob.setPenColor(0, 0, 100);}
	 else if(color.equalsIgnoreCase("red")) {rob.setPenColor(100, 0, 0);}
	 else if(color.equalsIgnoreCase("green")) {rob.setPenColor(0, 100, 0);}
	 if(height.equalsIgnoreCase("small")) {houseSize = 60; }
	 else if(height.equalsIgnoreCase("medium")) {houseSize = 120;}
	 else if(height.equalsIgnoreCase("large")) {houseSize = 250;}
	 rob.turn(90);
	 rob.move(10);
	 rob.turn(270);
	 rob.move(houseSize);
	 rob.turn(45);
	 rob.move(15);
	 rob.turn(45);
	 rob.move(15);
	 rob.turn(45);
	 rob.move(15);
	 rob.turn(45);
	 rob.move(houseSize);
	 rob.turn(270);
	 rob.setPenColor(0, 100, 0);
	 rob.move(10);
 }
 
}
