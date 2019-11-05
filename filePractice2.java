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
