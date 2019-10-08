package printNumbers;

public class PrintNumbers {

	public static void main(String[] args) {
		// print numbers[1 ][2 ][3 ][4 ][5 ][6 ][7 ]
		printNumber(7);
	}
	
	public static void printNumber(int max) {
		for (int i = 1; i <= max; i++) {
			System.out.print("[" + i + " ]");
		}
		System.out.println();
	}

}
