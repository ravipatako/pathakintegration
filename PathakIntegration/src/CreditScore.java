// Ravi Pathak
/*
 * A program integrating skills learned in COP 2006 The program is a finance calculator use to find
 * out potential paychecks And splits them up into saving and other ways to manage money
 */
class CreditScore {
  public static int scoreReport() {


    // 2D array for the different levels of Fico Credit Scores
    int[] scoreList = new int[5];
    scoreList[0] = 579;
    scoreList[1] = 625;
    scoreList[2] = 705;
    scoreList[3] = 774;
    scoreList[4] = 800;
    int arraySum = 0;
    for (int i = 0; i < scoreList.length; i++) {
      arraySum += scoreList[i]; // using the accumulator to pull the sum of credit scores
      // Getting the sums of the credit scores actually dont help at all
    }
    return arraySum;
  }

}
