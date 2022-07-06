
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
import java.util.Random;
public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot E = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		int m = 0;
		m++;
		int o = 50;
		int i = 90;
		while(m < 50)	{
		i = i + 10;
		o = o + 5;
		E.setSpeed(60);
		E.setPenWidth(10);
		E.penDown();
		E.move(i);
		E.turn(o);
		//3. Set the pen width to 10

		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("What color do you want your pen(Red, Green, or Blue)?");
		//5. Use an if/else statement to set the pen color that the user requested
		if() ) {
			E.setPenColor(, , );
		}
        //6. If the user doesn't enter anything, choose a random color
		
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		
		
		
		
		
		}
	}
}
