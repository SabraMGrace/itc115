package copyValue;

public class Value {

	public static void main(String[] args) {
		// copy by value
		int x = 23;
		strange(x);
		System.out.println("2. x = " + x);

	}
	
	public static void strange (int x) {
		x++;
		System.out.println("1. x = " + x);
	}

}
