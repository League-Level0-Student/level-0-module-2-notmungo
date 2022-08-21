//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	

	// TODO Auto-generated method stub


	// 2. Get the user to enter a question for the 8 ball to answer
	String question = JOptionPane.showInputDialog("what is a question?") ;

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
	Random rand = new Random();
    int randomNum;
	
	randomNum = rand.nextInt(4);
	// 4. If the random number is 0
    if (randomNum ==0) { 
    String message = JOptionPane.showInputDialog(null, "yes") ;
    }
	// -- tell the user "Yes"

	// 5. If the random number is 1
 if (randomNum ==1) { 
    String message = JOptionPane.showInputDialog(null, "no") ;
    }

	// 6. If the random number is 2
 if (randomNum ==2) { 
    String message = JOptionPane.showInputDialog(null, "Maybe you should ask google?") ;
    }
	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3
    if (randomNum ==3) { 
    String message = JOptionPane.showInputDialog(null, "Come again next time!") ;
    }
	// -- write your own answer
}
}
