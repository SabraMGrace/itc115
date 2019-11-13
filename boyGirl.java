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

// create Scanner in main to pull file data and call boyGirl method.
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
		
// create while loop to count the number of boys and girls. 
		while (input.hasNext()) {
			String name = input.next();
			if (name.equals("Erik") || name.equals("Tanner") || name.equals("Curtis") || name.equals("Ben")) {
				numberOfBoys += 1;
				boysSum += input.nextInt();
			} else if (name.equals("Rita") || name.equals("Jillyn") || name.equals("Stefanie")) {
				numberOfGirls += 1;
				girlsSum += input.nextInt();
			} else {
			}
			
// calculate the difference of girls' and boys' added ages.
			difference = girlsSum - boysSum;
		}
// print results.		
		System.out.println("There are " + numberOfBoys + " boys and " + numberOfGirls + " girls.");
		System.out.println("The difference between the boys' and girls' added ages is: " + difference);
	}
}
