package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Διαβάζει 2 ακεραίους από το stdin (keyboard)
 */

public class AddScannerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int sum = 0;

        // Εντολές

        System.out.println("Παρακαλώ εισάγεται 2 ακεραίους");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;

        //Εκτυπωση αποτελεσματων

        System.out.printf("Το άθροιμα των %d και %d είναι ίσο με %d\n", num1, num2, sum);
    }

}