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
		while (input.hasNext()) {
			String name = input.next();
	        double sum = 0.0;
	        while (input.hasNextDouble()) {
	            sum += input.nextDouble();
	        }
	        System.out.println("Sum = " + sum + name);
	}
	}
}
