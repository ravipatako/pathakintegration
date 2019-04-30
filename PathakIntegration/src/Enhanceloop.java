// Ravi Pathak
/*
 * A program integrating skills learned in COP 2006 The program is a finance calculator use to find
 * out potential paychecks And splits them up into saving and other ways to manage money
 */
public class Enhanceloop {
  /**
   * Working on enhance for loop for wealth. The loop actually doesn't serve any purpose currently
   * but might in the future.
   * 
   * @return
   */
  public static int loop() {
    int[] netWorth = {2, 3, 678, 123, 789, 12, 78, 49};
    int total = 0;

    for (int x : netWorth) {
      total += x;
    }
    return total;
  }
}
