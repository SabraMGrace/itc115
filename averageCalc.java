package averageCalc;

import java.util.Scanner;

public class AverageCalc {

	public static void main(String[] args) {
		// create a calculator to examine input sequence of numbers.
		
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers do you have?");
		int total = console.nextInt();
		
		int negatives = 0;
		double sum = 0.0;
		for (int i = 1; i <= total; i++) {
			System.out.print("    #" + i + "? ");
			double next = console.nextDouble();
			sum += next;
			if (next < 0) {
				negatives++;
			}
		}
		System.out.println();
		
		if (total <= 0) {
			System.out.println("No numbers to average.");
		}
		else {
			double average = sum / total;
			System.out.println("average = " + average);
		}
		System.out.println("# of negatives = " + negatives);
		
	}

}
