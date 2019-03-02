
public class Categorize {

	public static String budget(double paycheck, boolean organizeMoney) {
		String error = "Just so you know the calculator was made by Ravi Pathak." + "\n (Small plug from me)";

		if (organizeMoney == true) {
			System.out.println("I am here to help");

		} else {
			System.out.println("Sorry we couldnt help. I hope you enjoyed the calculator though!");
		}
		return error;

	}
}

/*
 * This budget method is going to go into a loop It will loop peoples money into
 * different categories The categories can be gotten from the User and then they
 * can decide how much (percentage wise) goes into each REMEMBER It can only go
 * up to 100%
 */
