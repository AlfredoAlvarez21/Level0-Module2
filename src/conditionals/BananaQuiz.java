//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package conditionals;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String input = JOptionPane.showInputDialog("Do You Like Bananas?");
		
		//2. if they say no, 
		
		if (input.equals("No")) {
      JOptionPane.showMessageDialog(null, "Error: Invaild Input. Error Code: 3c8a2j If This Cannot Be Fixed, Please Contact Us At StartLovingBananas.org/haters");
		}	
		//tell them they are crazy
			//and end quiz
		//3. if they say yes
      if (input.equals("Yes")){
    	  String ye = JOptionPane.showInputDialog("What Is Your Favorite Hobby");
  	}
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
JOptionPane.showMessageDialog(null, "<your hobby> Is Much Better With Bananas!");
		//4. OPTIONAL: if they say something other than â€œyesâ€� or â€œnoâ€�
		//	show a pop up that says â€œYou are bananas!â€�
	
	}

}
