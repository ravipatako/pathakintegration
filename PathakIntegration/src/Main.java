
import java.util.Scanner;

// Ravi Pathak
// A program integrating skills learned in COP 2006

//changes to just for testing

//Control (CMND (ON MAC)) Shift + F = Format

// when going from numbers to strong, clear buffer
//Driver Class
public class Main {
	// header with the parameters in main method
	public static void main(String[] args) {
		System.out.println(
				"Hellow, welcome to the TO BE NAMED calculator for finances. \n Please complete the information below");

		// Scanner getting the name for input
		Scanner userName = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = userName.nextLine();

		// getting the hourly wage from the user
		Scanner hourlyWage = new Scanner(System.in);
		System.out.println("Enter your hourly wage: ");
		double wage = hourlyWage.nextDouble();

		// user inputing their worked hours during the cycle
		Scanner weeklyHours = new Scanner(System.in);
		System.out.println("How many hours did you work this payement cycle?: ");
		double workedHours = weeklyHours.nextDouble();

		/*
		 * Calculates the users's potential net income Then it takes out the taxes and
		 * prints the result As well prints the payment before taxes
		 */

		double potentialPayment = workedHours * wage;
		double paycheck = Taxes.taxedMoney(wage, potentialPayment); // Calling the method and using the parameters
																	// "wage" and "Potential Payment"
		System.out.println("This is your taxed paycheck: $" + paycheck + "\n The taxes took out: $"
				+ (potentialPayment - paycheck));

		Scanner financeOrganize = new Scanner(System.in);
		System.out.println("(Enter True/False) Would you like to organize your money? : ");
		boolean organizeMoney = financeOrganize.nextBoolean();

		System.out.println(Categorize.budget(paycheck, organizeMoney));
	
		
		
		
		
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
