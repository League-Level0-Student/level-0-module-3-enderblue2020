package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		String A1 = JOptionPane.showInputDialog(null, "Are you happy? (Y/N)");
		if(A1.contentEquals("Y")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
		}
		if(A1.contentEquals("N")) {
			String A2 = JOptionPane.showInputDialog(null, "Do you want to be happy? (Y/N)");
			
			if(A2.contentEquals("Y")) {
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			if(A2.contentEquals("N")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
			}
		}
		
		
		
		
	}
	}