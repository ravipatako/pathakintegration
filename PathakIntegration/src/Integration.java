// Ravi Pathak
// A program integrating skills learned in COP 2006

// changes to just for testing
public class Integration {
  private int numTasks;
  private double incomeMoney;
  // setting private fields in the class

  // creating variables for the overloading method
  int band = 1000;
  int watchPatek = 100000;
  String watchMe = "I got the band but also need more to get the Patek. I will need $100,000. ";
  String gotIt = "But it's all good, because the check cleared, and now we have enough.";

  // putting in a constructor without parameters
  public void integration() {
    numTasks = 4;
    incomeMoney = 23.56;
  }

  // The getter for the class
  public int getNumTasks() {
    return numTasks;
  }

  // Creating the setter for the class
  public void setIncomeMoney(double incomeMoney) {
    this.incomeMoney = 12.34;
  }

  /*
   * Creating a new method a then went on to overload it with one method returning Int and the other
   * returning strings
   */

  public int getToWork(int band, int watchPatek) {
    return (band + watchPatek);

  }

  public String getToWork(String watchMe, String gotIt) {
    return (watchMe + gotIt);

  }
}
