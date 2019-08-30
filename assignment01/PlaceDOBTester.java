package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PlaceDOBTester {
	public static void main(String[] args) {

		DateAndPlaceOfBirth obj1 = new DateAndPlaceOfBirth(2000,3,30, "NYC", "NY", "USA" );
		DateAndPlaceOfBirth obj2 = new DateAndPlaceOfBirth(2000,3,30, "LA", "CA", "USA" );
		DateAndPlaceOfBirth obj3 = new DateAndPlaceOfBirth(2001,3,30, "CHI", "IL", "USA" );
		DateAndPlaceOfBirth obj4 = new DateAndPlaceOfBirth(1999,5,30, "Seoul", "Korea" );
		DateAndPlaceOfBirth obj5 = new DateAndPlaceOfBirth(1999,2,28, "Shanghai", "China" );

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		System.out.println(obj5);

		System.out.println(obj1.hasSameBirthDayAs(obj2));
		System.out.println(obj2.olderThan(obj3));
		System.out.println(obj3.youngerThan(obj4));
		System.out.println(obj4.hasSameBirthDateAs(obj5));

		try(var output = new PrintWriter(new FileOutputStream(
					new File("output.txt"), true /* true means append to file */))) {

							output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

							DateAndPlaceOfBirth obj12 = new DateAndPlaceOfBirth(2000,3,3, "NYC", "NY", "USA" );
							DateAndPlaceOfBirth obj22 = new DateAndPlaceOfBirth(2000,3,3, "LA", "CA", "USA" );
							DateAndPlaceOfBirth obj32 = new DateAndPlaceOfBirth(2001,3,3, "CHI", "IL", "USA" );
							DateAndPlaceOfBirth obj42 = new DateAndPlaceOfBirth(1999,5,3, "Seoul", "Korea" );
							DateAndPlaceOfBirth obj52 = new DateAndPlaceOfBirth(1234,2,3, "Shanghai", "China" );

							output.println(obj12);
							output.println(obj22);
							output.println(obj32);
							output.println(obj42);
							output.println(obj52);

							output.println(obj12.hasSameBirthDayAs(obj22));
							output.println(obj22.olderThan(obj32));
							output.println(obj32.youngerThan(obj42));
							output.println(obj42.hasSameBirthDateAs(obj52));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
