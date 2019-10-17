package datingApp;

import java.util.Scanner;

public class GoldDiggerDatingApp {

	public static void main(String[] args) {
		// create program for a dating app
		
		Scanner console = new Scanner(System.in);
		System.out.print("Age?   ");
		int age = console.nextInt();
		System.out.print("Height?   ");
		int height = console.nextInt();
		System.out.print("Height?   ");
		
		
		System.out.print("Salary?    ");
		double salary = console.nextDouble();
		
		boolean dateTonight = isDate(age, height, salary);

	}
public static boolean isDate(int age, int height, double salary) {
	
	boolean rich = salary >= 100000.00;
	boolean goodAge = age >= 21 && age <100;
	boolean goodHeight = height >= 50 && height < 84;
	
	if ((goodAge && goodHeight) || rich) {
		System.out.println("Okay, let's go out!");
		return true;
} else {
	System.out.println("It's not you, it's me. I'm a terrible person who only dates people based on superficial checklists.");
	return false;
}
}
}
