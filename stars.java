package stars;

public class Stars {


		// Print several lines of stars.
		// Uses a parameterized method to remove redundancy.
		
	public static void main(String[] args) {
		
		line(13, "*");
		line(7, "#");
		line(35, "xyz");
	}
	
	// Prints the given number of stars plus a line break.
	public static void line(int count, String s) {
		for (int i = 1; i <= count; i++) {
			System.out.println("*");
		}
		System.out.println();
	}

}
