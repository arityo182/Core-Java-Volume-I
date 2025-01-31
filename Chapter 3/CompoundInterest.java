/**
 * This program shows how to store tabular data in a 2D array.
 *
 * @version 1.40 2004-02-10
 * @author Cay Horstmann
 *         3.8
 */
public class CompoundInterest {
    public static void main(String[] args) {

        final double STARTRATE = 10;
        final int NRATES = 10;
        final int NYEARS = 10;

        // set interest rates to 10 . . . 19%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j) / 100.0;
            // System.err.println(Arrays.toString(interestRate));
        }

        double[][] balances = new double[NYEARS][NRATES];
        // System.err.println(Arrays.deepToString(balances));

        // set initial balances to 10000
        for (int j = 0; j < balances[0].length; j++) {
            balances[0][j] = 10000;
            // System.out.println(Arrays.deepToString(balances));
        }

        // // compute interest for future years
        for (int i = 1; i < balances.length; i++) {

            for (int j = 0; j < balances[i].length; j++) {
                // System.out.println(Arrays.deepToString(balances));

                // get latst year's balances from previous row
                double oldBalance = balances[i - 1][j];
                // System.out.println(oldBalance);

                // compute interest
                double interest = oldBalance * interestRate[j];
                // System.out.println(interest);

                // // compute this year's balances
                balances[i][j] = oldBalance + interest;
                // System.out.println(balances[0][0]);
                // System.out.println(Arrays.deepToString(balances))
            }
        }

        // print one row of interest rates
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }
        System.out.println();

        // print balance table
        for (double[] row : balances) {

            // print table row
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }
            System.out.println();
        }
    }
}
