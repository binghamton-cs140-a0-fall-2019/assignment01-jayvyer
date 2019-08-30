package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerTester {
	public static void main(String[] args) {
	Computer cp1 = new Computer ( "brand1", "very slow", 15, 1001, true, 5.5);
	Computer cp2 = new Computer ( "brand2", "medium speed", 16, 999, false, 4.5);
	Computer cp3 = new Computer ( "brand3", "fast", 17, 888, true, 3.5);
	Computer cp4 = new Computer ( "brand4", "very fast", 18, 777, false, 2.5);
	System.out.println(cp1);
	System.out.println(cp2);
	System.out.println(cp3);
	System.out.println(cp4);

		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR Computer.java:");
			Computer cp12 = new Computer ( "brand1", "very slow", 15, 1001, true, 5.5);
			Computer cp22 = new Computer ( "brand2", "medium speed", 16, 999, false, 4.5);
			Computer cp32 = new Computer ( "brand3", "fast", 17, 888, true, 3.5);
			Computer cp42 = new Computer ( "brand4", "very fast", 18, 777, false, 2.5);
			output.println(cp12);
			output.println(cp22);
			output.println(cp32);
			output.println(cp42);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
