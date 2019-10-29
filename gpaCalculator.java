//*******************************************************************
// Program: gpaCalculator
// Instructions: Write a calculator that generates the school term and average GPA based on student input.
// By: Sabra Grace
// Class: ITC 115 (Fall 2019)
// Date: 10/26/19
//*******************************************************************

package gpaCalculator;

import java.util.Scanner;

public class GPACalculator {

	private static Scanner console;

	public static void main(String[] args) {
		console = new Scanner(System.in);
		System.out.println("What is the student's name? ");
		String name = console.next();
		System.out.println("Enter the month's corresponding number (1 for January, 2 for February, and so on.) ");
		int month = console.nextInt();
		System.out.println("Enter the day of the month as a number. ");
		int day = console.nextInt();
		String term = season(month, day);
		Double gpa = gpaCalc();
		System.out.println(name + "'s GPA is " + gpa + " for " + term + " term.");
		console.close();
	}
	
		// create method to generate the term	
	public static String season(int month, int day) {
		String term = "";
		if (month >= 1 && month <= 2) {
			term = "winter";
		}if (month == 3 && day <= 15) {
			term = "winter";
		}if (month == 3 && day >= 16) {
			term = "spring";
		}if (month >= 4 && month <= 5) {
			term = "spring";
		}if (month == 6 && day <= 15) {
			term = "spring";
		}if (month == 6 && day >= 16) {
			term = "summer";
		}if (month >= 7 && month <= 8) {
			term = "summer";
		}if (month == 9 && day <=15) {
			term = "summer";
		}if (month == 9 && day >= 16) {
			term = "fall";
		}if (month >= 10 && month <= 11) {
			term = "fall";
		}if (month == 12 && day <= 15) {
			term = "fall";
		}if (month == 12 && day >= 16) {
			term = "winter";
		}
		return term;
	} 
	
	// create method to calculate GPA
	public static Double gpaCalc() {
		double gpa = 0.0;
		System.out.println("How many classes has the student taken at school? ");
		int numberOfClasses = console.nextInt();

		double classGPA = 0.0;
		double sum = 0.0;
		
		for (int i = 1; i <= numberOfClasses; i++) {
			System.out.println("What is the student's GPA in this class? ");
			classGPA = console.nextInt();
			sum += classGPA;
		}
		gpa = sum / numberOfClasses;
		return gpa;
	}
}
