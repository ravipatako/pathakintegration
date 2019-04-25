// Ravi Pathak
/*
 * A program integrating skills learned in COP 2006 The program is a finance calculator use to find
 * out potential paychecks And splits them up into saving and other ways to manage money
 */
public class Installment extends Loans {
  private String autoLoan;
  private String homeLoan;

  public Installment(String typeLoan) {
    super(typeLoan);
    // TODO Auto-generated constructor stub
  }

  void approved() {
    System.out.println("You were approved, for your loan!");
  }

  void declined() {
    System.out.println("Sorry you were declined, for your loan. ");
  }

  void interest() {
    this.autoLoan = "Auto Loans";
    this.homeLoan = "Home loans/Mortages";

    System.out.println("Two examples of Installment loans = " + autoLoan + homeLoan);
  }


}
