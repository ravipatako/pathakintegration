// Ravi Pathak
// A program integrating skills learned in COP 2006
public class Installment extends Loans {
	void approved() {
		System.out.println("You were approved, for your loan!");
	}

	void declined() {
		System.out.println("Sorry you were declined, for your loan. ");
	}

	void interest() {
		this.autoLoan = 1;
		this.homeLoan = 2;

		System.out.println("Two examples of Installment loans = " + autoLoan + homeLoan);
	}
}
