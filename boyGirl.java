//*******************************************************************
// ITC 115 (Fall 2019)
// boyGirl
// Read input from file for boyGirl method.
// Print how many boys and girls. 
// Print the difference between the boys and girls' added ages.
// By: Sabra Grace
// Date: 11/9/19
//*******************************************************************

package boyGirl;

import java.io.*;
import java.util.*;

// create Scanner to pull file data.
public class BoyGirl {
	public static void main(String[] args) 
			throws FileNotFoundException {
		 Scanner input = new Scanner(new File("boysgirls.txt"));
		 boyGirl(input);
	}
// define boyGirl method.
	public static void boyGirl(Scanner input) {
		int numberOfBoys = 0;
		int numberOfGirls = 0;
		int boysSum = 0;
		int girlsSum = 0;
		int difference = 0;
		while (input.hasNext()) {
			String name = input.next();
			System.out.println(name);
			if (name.equals("Erik") || name.equals("Tanner") || name.equals("Curtis") || name.equals("Ben")) {
				numberOfBoys += 1;
				boysSum += input.nextInt();
				System.out.println("a boy");
			} else if (name.equals("Rita") || name.equals("Jillyn") || name.equals("Stefanie")) {
				numberOfGirls += 1;
				girlsSum += input.nextInt();
				System.out.println("a girl");
			} else {
				System.out.println("neither");
			}
		}
		System.out.println("There are " + numberOfBoys + " boys and " + numberOfGirls + " girls.");
		System.out.println(boysSum);
		System.out.println(girlsSum);
		System.out.println("The difference between the boys and girls added ages is: " + difference);
	}
}
