import java.util.Scanner;

// Ravi Pathak
// A program integrating skills learned in COP 2006


//changes to just for testing

//Control (CMND (ON MAC)) Shift + F = Format

// when going from numbers to strong, clear buffer
public class Main {

  public static void main(String[] args) {
    System.out.println("Hello, to my Integration Project for COP 2006");
    Introduction.main(args);
    Excersise.Data();
  }



 static class Introduction {
	public static void main(String [] args) {
		
		//creating boolean values
		boolean first = true;
		boolean second = false; 
		
		//setting strings to the boolean value
		String bLean = Boolean.toString(first);
		String cLean = Boolean.toString(second);
		
		//printing out the string in the console to return the value
		
		System.out.println(bLean);
		System.out.println(cLean);
		
		
	}
}

static class Excersise {
  public static void Data() {
    int int1 = 2;
    double double1 = 2.0;
    String string1 = "2";

    /* Declare and initialize second integer, double, and String variables. */
    int int2 = 2;
    double double2 = 2.0;
    String string2 = "2";

    /* Print the sum of both integer variables on a new line. */
    System.out.println("The result of + with ints is " + (int1 + int2));
    /* Print the sum of the double variables on a new line. */
    System.out.println("The result of + with doubles is " + (double1 + double2));
    /* Concatenate and print the String variables on a new line. */
    System.out.println("The result of + with Strings is " + (string1 + string2));
  }
}







//Variable is a location in memory that contains data
//Scope the whole class definition

/* 
 * Byte - Used for saving memory, can be used instead of Int
 * Short - Used for saving memory where saving memory matters
 * Int - Used for whole numbers
 * Long - Used for really long numbers
 * Float - Similar to a double it allows for decimal places, use a 'f' at the end
 * Double - used for two decimal points
 * Boolean - True or False statements
 * Char - Single characters
 * 
 */


}

