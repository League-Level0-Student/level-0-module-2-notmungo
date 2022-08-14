//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(6);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		for (int i=0; i<10 ; i+=1 ) {
	
		Random rand = new Random();
		int randomChoice = rand.nextInt(5) + 1;
		if (randomChoice == 0) {
			
		} else if (randomChoice == 1) {
	    JOptionPane.showMessageDialog(null, "You are a very cool person!");	
		} else if (randomChoice == 2) {
			JOptionPane.showMessageDialog(null, "You are very tall!");	
		} else if (randomChoice == 3) {
		JOptionPane.showMessageDialog(null, "You are amazing at sports!");		
		} else if (randomChoice == 4) {
		JOptionPane.showMessageDialog(null, "You are very smart!");	
		} else if (randomChoice == 5) {
		JOptionPane.showMessageDialog(null, "You are good at coding!");			
		} 
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
	}
}
