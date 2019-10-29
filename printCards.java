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
	
	private static Scanner console;

	public static void main(String[] args) {
		// main method for shorthand card input.
		console = new Scanner(System.in);
		System.out.println("What is the card's rank (in shorthand)? \n (Example: K for King, 9, etc.) ");
		String shortRank = console.next();
		System.out.println("What is the card's suit (in shorthand)? \n (Example: C for Clubs, etc.) ");
		String shortSuit = console.next();
		String longRank = printCardRank(shortRank);
		String longSuit = printCardSuit(shortSuit);
		console.close();
		System.out.println("Your card is the " + longRank + " of " + longSuit + ".");
	}
	// method to print the longhand card rank.
	public static String printCardRank(String shortRank) {
		String longRank = "";
		if (shortRank.equalsIgnoreCase("A")) {
			longRank = "Ace";
		} else if (shortRank.equalsIgnoreCase("K")) {
			longRank = "King";
		} else if (shortRank.equalsIgnoreCase("Q")) {
			longRank = "Queen";
		} else if (shortRank.equalsIgnoreCase("J")) {
			longRank = "Jack";
		} else if (shortRank.equalsIgnoreCase("10")) {
			longRank = "Ten";
		} else if (shortRank.equalsIgnoreCase("9")) {
			longRank = "Nine";
		} else if (shortRank.equalsIgnoreCase("8")) {
			longRank = "Eight";
		} else if (shortRank.equalsIgnoreCase("7")) {
			longRank = "Seven";
		} else if (shortRank.equalsIgnoreCase("6")) {
			longRank = "Six";
		} else if (shortRank.equalsIgnoreCase("5")) {
			longRank = "Five";
		} else if (shortRank.equalsIgnoreCase("4")) {
			longRank = "Four";
		} else if (shortRank.equalsIgnoreCase("3")) {
			longRank = "Three";
		} else if (shortRank.equalsIgnoreCase("2")) {
			longRank = "Two";
		}
		return longRank;
	}
	
	// method to print the longhand card suit.
	public static String printCardSuit(String shortSuit) {
		String longSuit = "";
		if (shortSuit.equalsIgnoreCase("C")) {
			longSuit ="Clubs";
		} else if (shortSuit.equalsIgnoreCase("D")) {
			longSuit = "Diamonds";
		} else if (shortSuit.equalsIgnoreCase("H")) {
			longSuit = "Hearts";
		} else if (shortSuit.equalsIgnoreCase("S")) {
			longSuit = "Spades";
		}
		return longSuit;
	}
}

