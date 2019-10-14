/* Sabra Grace
 * ITC 115
 * Assignment 3: printPowersOfN.java
 * Fall 2019
*/ 

package printPowersOfN;

public class PrintPowersOfN {

	public static void main(String[] args) {
		// This program prints the sequence for each power of the base of 0 up to that maximum power, inclusive.
		
		// Main function printPowersOfN
		
		System.out.println("This program prints the sequence for each power of the base up to the maximum power, inclusive (without importing the math class, per the textbook).\n");
		System.out.println("The inclusive sequence of 2 to the power of 7 is: ");
		printPowersOfN(2, 7);
		System.out.println("\n \n" + "The inclusive sequence of 5 to the power of 3 is: ");
		printPowersOfN(5, 3);
		
	}
	
	// define PowersOfN function
	public static void printPowersOfN(int base, int exp) {
		// Print base to the power of 0
		System.out.print("1 ");
		System.out.print(base);
		int x = base;
		for (int i = 1; i < exp; i++) {
			System.out.print(" ");	
			x *= base;
			System.out.print(x);
				
		}
	}
		

		//System.out.println(printPowersOfN(x, y);)
}
