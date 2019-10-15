package oct14Test;

import java.util.Scanner;

public class Oct14Test {

	public static void main(String[] args) {
		// create the scanner object
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter GPA: ");
		double gpa = console.nextDouble();
		if (gpa >+ 2.0) {
			System.out.println("Application accepted.");
		}
		System.out.println("After the if statement.");
		console.close();
	}

}
