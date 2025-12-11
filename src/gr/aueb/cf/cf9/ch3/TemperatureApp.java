package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/** ο χρηστης εισαγει εναν ακεραιο που συμβολιζει μια θερμοκρασια
 * και το προγραμμα υπολογιζει αν η θερμοκρασια είναι <0 τότε  μια μεταβλητή γίνεται true
 * αλλιώς γίνεται false
 */

public class TemperatureApp {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero ;

        //εισαγωγή δεδομένων
        System.out.println("Παρακαλώ εισάγεται την θερμοκρασία");
        temperature = scanner.nextInt();

        //επεξεργασία δεδομένων

        isTempBelowZero = temperature < 0;

        // Εκτυπωση αποτελέσματος

        System.out.println("Η θερμοκρασία είναι μικρότερη από 0: " + isTempBelowZero);
    }
}
