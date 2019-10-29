  
//*******************************************************************
// Midterm Project Program: printCards
// Instructions: Write a program that reads a shorthand text description of a playing card and prints the longhand equivalent.
// By: Sabra Grace
// Class: ITC 115 (Fall 2019)
// Date: 10/28/19
//*******************************************************************

package printCards;

import java.util.Scanner;

public class PrintCards {

	public static void main(String[] args, Scanner console) {
		// main method for shorthand card input.
		console = new Scanner(System.in);
		System.out.println("What is the card's rank (in shorthand)? \n Example: K for King, 9, etc. ");
		String rank = console.next();
		System.out.println("What is the card's suit (in shorthand)? \n Example: C for Clubs, etc. ");
		String suit = console.next();
		printCardName(rank, suit);	
	}
	// method to print the longhand card name.
	public static void printCardName(String rank, String suit) {
		if (rank.equalsIgnoreCase("A")) {
			System.out.println("Ace of ");
		} else if (rank.equalsIgnoreCase("K")) {
			System.out.println("King of ");
		} else if (rank.equalsIgnoreCase("Q")) {
			System.out.println("Queen of ");
		} else if (rank.equalsIgnoreCase("J")) {
			System.out.println("Jack of ");
		} else if (rank.equalsIgnoreCase("10")) {
			System.out.println("Ten of ");
		} else if (rank.equalsIgnoreCase("9")) {
			System.out.println("Nine of ");
		} else if (rank.equalsIgnoreCase("8")) {
			System.out.println("Eight of ");
		} else if (rank.equalsIgnoreCase("7")) {
			System.out.println("Seven of ");
		} else if (rank.equalsIgnoreCase("6")) {
			System.out.println("Six of ");
		} else if (rank.equalsIgnoreCase("5")) {
			System.out.println("Five of ");
		} else if (rank.equalsIgnoreCase("4")) {
			System.out.println("Four of ");
		} else if (rank.equalsIgnoreCase("3")) {
			System.out.println("Three of ");
		} else if (rank.equalsIgnoreCase("2")) {
			System.out.println("Two of ");
		
		

		
	}

}
}
