package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester{
  public static void main(String[]args){
    DateAndPlaceOfBirth date = new DateAndPlaceOfBirth(2000, 3, 30, "NYC", "NY", "USA");
    StreetUSAddress street = new StreetUSAddress("123 123 123", "456 456", "NYC", "NY", "789-789");
    Person human = new Person("Javier", "Liu", "11111", date, street);
    System.out.println(human);

    try(var output = new PrintWriter(new FileOutputStream(
          new File("output.txt"), true /* true means append to file */))) {
               output.println("\nTESTS FOR Person.java");
               DateAndPlaceOfBirth date2 = new DateAndPlaceOfBirth(2000, 3, 30, "NYC", "NY", "USA");
               StreetUSAddress street2 = new StreetUSAddress("123 123 123", "456 456", "NYC", "NY", "789-789");
               Person human2 = new Person("Javier", "Liu", "11111", date, street);
               output.println(human2);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

}
