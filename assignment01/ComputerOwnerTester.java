package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester {
  public static void main(String[] args) {
    try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true /* true means append to file */))) {
			output.println("\nTESTS FOR ComputerOwner.java:");
      DateAndPlaceOfBirth dob = new DateAndPlaceOfBirth(2000, 03, 30, "NYC", "NY", "US");
      StreetUSAddress addy = new StreetUSAddress("1234", "Vestal Parkway East", "Binghamton", "NY", "13902");
      Person human = new Person("Javier", "Liu", "123-45-6789", dob, addy);
      ComputerOwner owner = new ComputerOwner(human);

      Computer comp1 = new Computer("abrand1", "a little wow", 11, 1001, true, 1000 );
      Computer comp2 = new Computer("abrand2", "medium wow", 12, 1002, false, 1001 );
      Computer comp3 = new Computer("abrand3", "wow", 13, 999, true, 555 );
      Computer comp4 = new Computer("abrand4", "holy wow", 14, 888, false, 665 );

		  owner.addComputer(comp1);
      owner.addComputer(comp2);
      owner.addComputer(comp3);
      owner.addComputer(comp4);

      System.out.println(owner);

      owner.removeComputer(1);
      owner.removeComputer(2);

      System.out.println(owner);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
