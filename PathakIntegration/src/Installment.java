// Ravi Pathak
// A program integrating skills learned in COP 2006
public class Installment extends Loans {
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
