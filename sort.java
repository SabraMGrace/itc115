//*******************************************************************
// ITC 115 (Fall 2019)
// sort
// P. 523, ex. 4 Write a method isSorted that accepts an array…  50 points
// Test your methods from the main. 
// Do not use the built in sorting methods. Implements your own, or you will no get credit for this assignments.
// https://practiceit.cs.washington.edu/problem/view/bjp4/chapter7/e4-isSorted
// P. 524 ex 11 Write a method named isUnique...50 points
// Test your method from the main. 
// Hint: You will need a nested for loop to solve this.
// By: Sabra Grace
//*******************************************************************

package sort;

public class Sort {

	public static void main(String[] args) {
		// define main method isSorted to accept input of real numbers in ascending order.
		System.out.println("5 6 7 8 9");
		double[] array = {5, 6, 7, 8, 9};
		isSorted(array);
		isUnique(array);
	}
	
	public static boolean isSorted(double[] array) {
		for(int i=0; i < array.length -1; i++) {
			if (array[i] > array[i+1]) {
				System.out.println("Try again. The numbers need to be entered in an increasing order.");
				return false;
			}
		
		}
		System.out.println("The numbers are sorted in ascending order.");
		return true;
	}


	public static boolean isUnique(double[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				double leftComparison = array[i];
				double rightComparison = array[j];
				if (i != j) {
					if (leftComparison == rightComparison) {
						System.out.println("The set of numbers is not unique. There is a duplicate number in the array.");
						return false;
					}
						
				}
			}
		}
		System.out.println("The set of numbers is unique!");
		return true;
	}
}

