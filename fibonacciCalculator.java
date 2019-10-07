/* Sabra Grace
 * ITC 115
 * Assignment 2: Fibonacci Calculator
 * Fall 2019
*/ 


package fibonacciCalculator;

public class fibonacciCalculator {

	public static void main(String[] args) {
		// Use a for loop to compute and print out the first 12 Fibonacci numbers, beginning with 1 (using the 5th edition textbook).
		// Main function fibCalc
		System.out.println("This program calculates the first 12 Fibonacci numbers beginning with 1 (using the 5th textbook edition).");
		
		fibCalc();
	}
		// Use a for loop to compute and print out the first 12 Fibonacci numbers.
	public static void fibCalc(){
		int previous = 0; 
		int current = 1;
		int fibonacci;
		for (int i = 1; i <= 12; i++) {
			fibonacci = previous + current;
			previous = current;
			current = fibonacci;
			System.out.println(fibonacci);

		}
	}
	
}
