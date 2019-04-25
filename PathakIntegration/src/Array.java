// Ravi Pathak
/*
 * A program integrating skills learned in COP 2006 The program is a finance calculator use to find
 * out potential paychecks And splits them up into saving and other ways to manage money
 */
public class Array {
  /**
   * Array takes in the integers and finds its index.
   * 
   * @return
   */
  public static int identifyArray() {
    int[] simpleArray = new int[] {4, 6, 16, 8, 56};
    for (int i = 1; i < simpleArray.length;) {
      if (simpleArray[i] == 6) {
        return i;
      } else if (simpleArray[i] == 8) {
        return i;
      } else if (simpleArray[i] == 56) {
        return i;
      } else {
        return 0;
      }
    }
    return 0;
  }
}


