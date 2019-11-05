
import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		
		File f = new File("hamlet.txt");
		System.out.println("Exists returns: " + f.exists());
		System.out.println("Can read returns: " + f.canRead());
		System.out.println("Length returns: " + f.length());
		System.out.println("Absolute path returns: " + f.getAbsolutePath());
	
		

	}

}



import java.io.*;


//write to a file

public class Hello {

	public static void main(String[] args) throws FileNotFoundException    {

			PrintStream output = new PrintStream(new File("hello.txt"));
		
			output.println("Hello world");
			output.println();
			output.println("This program produces");
			output.println("four lines of outupt");
			output.println("the old content is gone");
			
			output.close();
			







/ Displays changes in temperature from data in an input file.

import java.io.*;    // for File
import java.util.*;  // for Scanner

public class Temperatures {
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("weather.txt"));
        double prev = input.nextDouble();   // fencepost
        while (input.hasNextDouble()) {
            double next = input.nextDouble();
            System.out.println(prev + " to " + next +
                    ", change = " + (next - prev));
            prev = next;
        }
    }
}



// Displays changes in temperature from data in an input file.

import java.io.*;    // for File
import java.util.*;  // for Scanner

public class Temperatures2 {
    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("weather.txt"));
        double prev = input.nextDouble();   // fencepost
        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                double next = input.nextDouble();
                System.out.println(prev + " to " + next +
                        ", change = " + (next - prev));
                prev = next;
            } else {
                input.next();  // throw away unwanted token
            }
        }
    }
}
