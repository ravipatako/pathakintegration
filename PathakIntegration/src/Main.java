
import java.util.Scanner;

// Ravi Pathak
// A program integrating skills learned in COP 2006

//changes to just for testing

//Control (CMND (ON MAC)) Shift + F = Format

// when going from numbers to strong, clear buffer
//Driver Class
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello, to my Integration Project for COP 2006");
		Introduction.carDemo();
		Exercise.doData();
		inClass();

	}

	

	

	public static void inClass() {
		double num1 = 5;
		double num2 = 10;
		// this is a call, in the paraenthesses is an argument
		double squared = squaredIt(num1, num2, "Hello");
		System.out.println(squared);

		

	}
	public static double squaredIt(double num1, double num2, String string) {
		// TODO Auto-generated method stub
		return num1 * num1;
	}

//Variable is a location in memory that contains data
//Scope the whole class definition

	/*
	 * Byte - Used for saving memory, can be used instead of Int Short - Used for
	 * saving memory where saving memory matters Int - Used for whole numbers Long -
	 * Used for really long numbers Float - Similar to a double it allows for
	 * decimal places, use a 'f' at the end Double - used for two decimal points
	 * Boolean - True or False statements Char - Single characters
	 * 
	 */

}
