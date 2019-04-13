// Ravi Pathak
// A program integrating skills learned in COP 2006
public class Categorize {

	// At first the if statement was working with boolean values, but now it should
	// be changed to running an
	// string for being YES/NO

	public static String budget(double paycheck, String inputString) {
		String error = "";

		// using the == isEqualTo operator to make sure that the user wants help with
		// their money
		if (inputString.equals("yes")) {
			System.out.println("Great, well Im here to help \n So lets get right into it and save you some money! ");
		} else if (inputString.equals("Yes")) {
			System.out.println("Great, well Im here to help \n So lets get right into it and save you some money! ");
		} else if (inputString.equals("No")) {
			System.out.println("Sorry we couldnt help. I hope you enjoyed the calculator though!"
					+ "\n Just so you know the calculator was made by Ravi Pathak.\n (Small plug from me)");
		} else {
			System.out.println("Sorry but you went wrong somewhere. Please try again!"
					+ "\n Just so you know the calculator was made by Ravi Pathak.\n (Small plug from me)");
		}
		return error;

	}
	
	public static String categories(int moneySplit) {
		String goofed = "";
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return goofed;
	}
	
	
}




/*
 * This budget method is going to go into a loop It will loop peoples money into
 * different categories The categories can be gotten from the User and then they
 * can decide how much (percentage wise) goes into each REMEMBER It can only go
 * up to 100%
 */
