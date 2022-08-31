
package _99_extra;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		// 1. Use the dance method below to make the robot spin.
		dance(1);
		// 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
 	String diz = JOptionPane.showInputDialog("Enter a number between 1 and 100");
 	int dizzy = Integer.parseInt(diz);
dance(dizzy);
	}

	/*****************   Use this method, DON'T CHANGE THE CODE BELOW  **************/
	
	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.penDown();
			Random e = new Random();
			robot.setSpeed(50);
			int a = 0;
			a = e.nextInt(200);
			int u = e.nextInt(800);
			robot.turn(u);
			robot.move(a);
			a = e.nextInt(200);
		}
	}
}

