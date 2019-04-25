// Ravi Pathak
/*
 * A program integrating skills learned in COP 2006 The program is a finance calculator use to find
 * out potential paychecks And splits them up into saving and other ways to manage money
 */
public class Account extends Management {

  /*
   * Starting out with creating a class and then creating a private method The method gets the name
   * and from that
   */

  protected String name; // name of the account
  private String owner; // name of the owner of the account
  private double initialDeposit; // how much the user is depositing at first
  public int yearsToClose; // estimated year when account will be close

  /*
   * The years to close is used to determine some kind of interest that will be collected throughout
   * that period
   */
  private int minimumStart; // minimum amount needed in the account

  public int getMinimumStart() {
    return minimumStart;
  }

  public void setMinimumStart(int minimumStart) {
    this.minimumStart = minimumStart;
  }

}
