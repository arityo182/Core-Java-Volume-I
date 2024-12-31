import java.util.*;

/**
 * This program demonstrates array manipulation
 *
 * @version 1.20 2004-02-10
 * @author Cay Hostman
 *         3.7
 */
public class LotteryDrawing {
    public static void main(String[] args) {

        // Scanner in = new Scanner(System.in);

        // System.err.print("How numbers do you need to draw? ");
        // int k = in.nextInt();

        // System.out.print("What is the highest number you can draw? ");
        // int n = in.nextInt();

        int n = 6;
        // fill an array with numbers 1 2 3... n
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            // System.out.println(Arrays.toString(numbers));
            // [1, 0, 0, 0, 0, 0]
            // [1, 2, 0, 0, 0, 0]
            // [1, 2, 3, 0, 0, 0]
            // [1, 2, 3, 4, 0, 0]
            // [1, 2, 3, 4, 5, 0]
            // [1, 2, 3, 4, 5, 6]
        }

        int k = 4;
        // draw k numbers and put them into a second array
        int[] result = new int[k];
        // System.out.println(Arrays.toString(result));
        for (int i = 0; i < result.length; i++) {

            // make a random index between 0 and n - 1
            int r = (int) (Math.random() * n); // math.random 0 - 1
            // System.out.println(r);
            // pick the element at the random location
            result[i] = numbers[r];
            // System.out.println(Arrays.toString(result));

            // move the last element into the random location
            numbers[r] = numbers[n - 1];
            // System.out.println(Arrays.toString(numbers));
            n--;
            // System.out.println(n);
        }

        // print the sorted array
        Arrays.sort(result);
        System.out.println("Bet the following combination. It'll make you rich!");
        for (int r : result) {
            System.out.println(r);
        }
    }
}
