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
		System.out.print("Salary?   ");
		double salary = console.nextDouble();
		System.out.print("Location?    ");
		String location = console.next();
		System.out.print("Do you have kids? (y/n)");
		String kids = console.next();
		
		
		boolean dateTonight = isDate(age, height, salary, location, kids);

	}
public static boolean isDate(int age, int height, double salary, String location, String kids) {
	
	boolean rich = salary >= 100000.00;
	boolean nokids = kids.equals("n");
	boolean goodlocation = location.equals("Seattle");
	boolean goodAge = age >= 21 && age <100;
	boolean goodHeight = height >= 50 && height < 84;
	
	if ((goodAge && goodHeight && goodlocation) || rich && nokids) {
		System.out.println("Okay, let's go out!");
		return true;
} else {
	System.out.println("It's not you, it's me. I'm a terrible person who only dates people based on superficial checklists.");
	return false;
}
}
}
