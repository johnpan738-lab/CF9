package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * ο χρήστης εισάγει 2 τιμές , αριθμητή και
 * παρανομαστή και το πρόγραμμα υπολογίζει το
 * πηλικό επαναληπτικά
 *
 * Αν ο αριθμητής είναι 0 τοτε το πρόγραμμα διακόπτεται.
 * Αν ο παρανομαστής είναι 0, τότε η διαδικασία επαναλαμβάνεται'
 */
public class DivisionApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please enter a numerator: ");
            numerator = scanner.nextInt();

            if (numerator ==0) {
                System.out.println("Numerato is 0. Quitting ....");
                break;
            }
            System.out.println("Please enter a denominator");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Can not be dived by zero");
                continue;
            }
        result = numerator / denominator;
            System.out.println("Result: " + result);
            }
    }
}
