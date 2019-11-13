//*******************************************************************
// ITC 115 (Fall 2019)
// boyGirl
// Pull file for boyGirl method
// By: Sabra Grace
// Date: 11/9/19
//*******************************************************************

package boyGirl;

import java.io.*;
import java.util.*;

public class BoyGirl {

	public static void main(String[] args) {
		boygirl();
	}
}
	public static void boygirl() {
		throws FileNotFoundException {
	        input = new Scanner(new File("boysgirls.txt"));
	        double sum = 0.0;
	        int count = 0;
	        while (input.hasNextDouble()) {
	            double next = input.nextDouble();
	            count++;
	            System.out.println("number " + count + " = " + next);
	            sum += next;
	        }
	        System.out.println("Sum = " + sum);

	}
