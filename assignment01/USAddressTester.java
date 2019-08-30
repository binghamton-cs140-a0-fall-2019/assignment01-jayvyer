package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
	public static void main(String[] args) {
    StreetUSAddress firstaddress = new StreetUSAddress("12-34","","NYC","NY","1234");
    StreetUSAddress secondaddress = new StreetUSAddress("67-89","10th Avenue","ABC","DE","6789");
		System.out.println(firstaddress);
		System.out.println(secondaddress);
		try(var output = new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
               output.println("\nTESTS FOR StreetUSAddress.java");

               StreetUSAddress one2 = new StreetUSAddress("345 Chambers Street", "", "New York", "NY", "10282");
               StreetUSAddress two2 = new StreetUSAddress("123 XYZ Street", "FL 2", "New York", "NY", "13123");
               output.println(one2);
               output.println(two2);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
	}
}
