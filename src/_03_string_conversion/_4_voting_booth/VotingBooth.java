package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String userAge = JOptionPane.showInputDialog( "What is your age");
	int userAge1 = Integer.parseInt(userAge) ;
    if (userAge1 >= 18) {
    	String presidentChoice = JOptionPane.showInputDialog( "Who should the next president be?");
    	
    }
    else if (userAge1 < 18) {
    	JOptionPane.showMessageDialog(null, "Nobody cares what you think, sorry");
    }
    
    
    
    
}
}
