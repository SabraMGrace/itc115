//*******************************************************************
// Program: danceReplicator
// Instructions: Write a method called repl that accepts a String and a number of repetitions...
// ***I have the 5th edition of the textbook and couldn't find the instructions on page 309, ex. 2 -- I wrote a program that replicates a string per the instructions.***
// By: Sabra Grace
// Date: 10/19/19
//*******************************************************************

package replicator;

import java.util.Scanner;

public class DanceReplicator {

	public static void main(String[] args) {
		// create scanner object to gather input
		Scanner console = new Scanner(System.in);
		System.out.println("What is your favorite dance move? ");
		String dance = console.next();
		System.out.println("How many times do you want to do this dance move? ");
		int x = console.nextInt();
		repl(dance, x); 
	}
// create method repl to accept string and number of repetitions.		
public static void repl(String dance, int x) {
		if (x < 1) {
				System.out.println("That's not a very fun dance. Please try again.");
}		else if (x >= 10) {
				System.out.println("Yikes! That's a lot of dance moves. I think I'll get too tired. Please try again.");
}		else {  // print dance instructions
		System.out.println("\n Play your favorite song and follow the DANCE INSTRUCTIONS!");
		for (int i = 1; i <= x; i++ ) {
			System.out.println(" Spin \n Jump \n" + " " + dance + " " + "\n Splits \n Jazz Hands \n Flip \n" + " " + dance);
		}
	}
}
}
