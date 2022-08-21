package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lottery {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int randomChoice = rand.nextInt(100) ;
		
		int randomChoice1 = rand.nextInt(100) ;
		
		int randomChoice2 = rand.nextInt(100) ;
		
		int randomChoice3 = rand.nextInt(100) ;
		
		int randomChoice4 = rand.nextInt(100) ;
		
		int randomChoice5 = rand.nextInt(100) ;
		JOptionPane.showMessageDialog(null, randomChoice + " " + randomChoice1 + " " + randomChoice2 + " " + randomChoice3 + " " + randomChoice4 + " " + randomChoice5 );
		
		
	}
	
}