
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24nd";
		String dadsBirthday = "June 9rd";
		String myBirthday = "January 18st";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String request = JOptionPane.showInputDialog("Which birthday do you want? mom/dad/me");
		// 3. Print out what the user typed
		System.out.println("" + request);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(request.contentEquals("mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(request.contentEquals("dad")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(request.contentEquals("me")) {
			System.out.println(myBirthday);
		}
		else {
			System.out.println("Sorry, i don't remember that person's birthday!");
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
