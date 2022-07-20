package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Areyouhappy {
public static void main(String[] args) {

	String A1 = JOptionPane.showInputDialog("You are in a forest. You come to a clearing. There is a small cabin. Do you enter to cabin or keep travelling?(Cabin/Path)");
	if(A1.contentEquals("Cabin")) {
		String A2a = JOptionPane.showInputDialog(null, "You enter the cabin. There is an unlit fire and a small attic. Light the fire or go upstairs?(Fire/Ladder)");
		if(A2a.contentEquals("Ladder")) {
			
		}
		}
	
	if(A1.contentEquals("Path")) {
		String A2b = JOptionPane.showInputDialog("You follow the path. Suddenly, there's a huge rock slide!!! Run or hide? (Run/Hide)");
		if(A2b.contentEquals("Run")) {
			JOptionPane.showMessageDialog(null, "You are unable to outrun the rockslide. You died!");
		}
		if(A2b.contentEquals("Hide")) {
			JOptionPane.showMessageDialog(null, "Nowhere to hide! You died!");
	}
	
	
	
	
	
	
	
}
}
}