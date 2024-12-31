import java.util.Arrays;

public class cobacoba {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NYEARS = 6;
        final int NRATES = 10;

        double[] interestRate = new double[NRATES];
        for (int i = 0; i < interestRate.length; i++) {
            interestRate[i] = (STARTRATE + i) / 100.0;
            // System.out.println(Arrays.toString(interestRate));
        }

        final double[][] balances = new double[NYEARS][NRATES];

        for (int i = 0; i < balances.length; i++) {
            balances[0][i] = 10000;
            System.out.println(Arrays.deepToString(balances));
        }

    }

}
