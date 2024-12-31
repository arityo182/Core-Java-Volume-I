import java.util.*;

/**
 * This program demonstrates console input
 *
 * @version 1.10 2004-02-10
 *          3.2
 */
public class InputTest {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);

        // Get first input
        System.out.print("What is your name? ");
        String name = in.nextLine();

        // Get second input
        System.out.print("How old are You? ");
        int age = in.nextInt();

        // Display output on console
        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
    }
}
