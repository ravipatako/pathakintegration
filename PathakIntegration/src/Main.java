
import java.util.Scanner;

// Ravi Pathak
/*
 * A program integrating skills learned in COP 2006 The program is a finance calculator use to find
 * out potential paychecks And splits them up into saving and other ways to manage money
 */

// changes to just for testing

// Control (CMND (ON MAC)) Shift + F = Format

// when going from numbers to strong, clear buffer
// Driver Class
public class Main {
  // header with the parameters in main method
  /**
   * Program starts with getting info from user.
   * 
   * @param args starts the program
   */

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println(
        "Hellow, welcome to ORG calculator for finances. \n Please complete the information below");

    // Scanner getting the name for input
    System.out.println("Enter your Name: ");
    String name = scan.nextLine();

    // getting the hourly wage from the user
    System.out.println("Enter your hourly wage: ");
    final double wage = scan.nextDouble();
    scan.nextLine();

    // user inputing their worked hours during the cycle
    System.out.println("How many hours did you work this payement cycle?: ");
    double workedHours = scan.nextDouble();
    scan.nextLine();

    /*
     * Calculates the users's potential net income Then it takes out the taxes and prints the result
     * As well prints the payment before taxes
     */

    double potentialPayment = workedHours * wage;
    double paycheck = Taxes.taxedMoney(wage, potentialPayment); // Calling the method and using the
    // parameters "wage" and "Potential Payment"

    System.out.println("This is your taxed paycheck: $" + paycheck + "\n The taxes took out: $"
        + (potentialPayment - paycheck));

    System.out.println("Would you like to organize your money?  ");
    String inputString = scan.nextLine();

    // Comparing the input to the if else statement in the categorize class
    System.out.println(Categorize.budget(paycheck, inputString));

    System.out.println("Now that we know you want to organize your new found wealth, \n "
        + "how many categorize do you want it to get split up into? ");
    int moneySplit = scan.nextInt();
    scan.nextLine();
    // Getting input from the user telling how many categories they want their money

    // From this point of the program, the code is not heavily focused on the finance calculator
    // but more for the requirements of the projects. Will update the calculator after the class

    int manualSum = CreditScore.scoreReport();
    // Calling the method scoreReport to print out the sum of an Array
    System.out.println("The sum for the credit scores is:" + manualSum);
    System.out.println("Even though the sum of Fico Credit Scores are irrelevant.");

    int enhancedSum = Enhanceloop.loop();
    // prints out the sum of the enhanced loop
    System.out.println("The sum of the loop is " + enhancedSum);


    /*
     * int indexLocation = Array.identifyArray(); System.out.println(indexLocation);
     */


    /*
     * Loans[] borrow = new Loans[5]; borrow[0] = new Installment(); borrow[1] = new Fixedrate();
     * borrow[2] = new Installment(); borrow[3] = new Fixedrate(); borrow[4] = new Installment();
     * borrow[5] = new Installment();
     * 
     * for (int x = 0; x < 5; ++x) { borrow[x].approved(); }
     */

  }

  // Variable is a location in memory that contains data
  // Scope the whole class definition

  /*
   * Byte - Used for saving memory, can be used instead of Int Short - Used for saving memory where
   * saving memory matters Int - Used for whole numbers Long - Used for really long numbers Float -
   * Similar to a double it allows for decimal places, use a 'f' at the end Double - used for two
   * decimal points Boolean - True or False statements Char - Single characters
   * 
   */

}

/*
 * Describe inheritance and its benefits - Inheritance is when an object receives values from a
 * parental object. Example of this would be having a person class and then having a worker class
 * getting fields and methods from the person class The benefits include being able to create object
 * more quickly and more specifically
 * 
 */
