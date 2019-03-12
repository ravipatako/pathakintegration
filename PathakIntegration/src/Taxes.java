// Ravi Pathak
// A program integrating skills learned in COP 2006
public class Taxes {

	public static double taxedMoney (double wage, double potentialPayment) {
			if (wage <= 10) {
				return potentialPayment * 0.90;
			}
			
			else if (wage > 10 && wage <= 13) {
				return potentialPayment * 0.89;
			}
			
			else if (wage > 13 && wage <= 20) {
				return potentialPayment * 0.87;
			}
			
			else if (wage >= 20.1) {
				return potentialPayment * 0.80;
			}
			return 0;
	}

}
