// Ravi Pathak
/*
 * A program integrating skills learned in COP 2006 The program is a finance calculator use to find
 * out potential paychecks And splits them up into saving and other ways to manage money
 */
public class Taxes {
  /**
   * This else if statement takes in the income and finds out the taxes cut.
   * 
   * @param wage -the amount user is paid
   * @param potentialPayment -how much user could be paid before taxes
   * @return
   */
  public static double taxedMoney(double wage, double potentialPayment) {
    if (wage <= 10) {
      return potentialPayment * 0.90;
    } else if (wage > 10 && wage <= 13) {
      return potentialPayment * 0.89;
    } else if (wage > 13 && wage <= 20) {
      return potentialPayment * 0.87;
    } else if (wage >= 20.1) {
      return potentialPayment * 0.80;
    } else {
      return 0;
    }
  }

}
