
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		
		// 2. Print out the random variable above
		JOptionPane.showMessageDialog(null, "" + random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String guess = JOptionPane.showInputDialog("Enter a numbered guess");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int	guessInt = Integer.parseInt(guess);
			// 5. if the guess is correct
			if(guessInt == random) {
				JOptionPane.showMessageDialog(null, "You guessed correctly!!");
				// 6. Win
				System.exit(0);
			}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			if(guessInt > random) {
			// 7. if the guess is high
				JOptionPane.showMessageDialog(null, "Too high!");
			}
				// 8. Tell them it's too high
			if(guessInt < random) {
				JOptionPane.showMessageDialog(null, "Too low!");
			}
			// 9. if the guess is low
				// 10. Tell them it's too low
		}
		// 13. Tell them they lose
		JOptionPane.showInternalMessageDialog(null, "You lose!");
	}

}


