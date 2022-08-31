
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
	String ban = JOptionPane.showInputDialog("Do you like bananas? yes/no");
		//2. if they say no, 
			//tell them they are crazy 
	if(ban.contentEquals("no")){
		System.out.println("You are CRAZY!");
		System.exit(404);
	}
			//and end quiz
	
		//3. if they say yes
	if(ban.contentEquals("yes")) {
		 String hobby = JOptionPane.showInputDialog("What is your favorite hobby??");
		 System.out.println(hobby + " is much better with bananas!!");
	}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
	
	}

}
