package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το απόλυτο ενο ακεραίου με την χρήση του
 * τριαδικού τελεστή . Το απόλυτο ενος ακεραίου είναι θετικός
 * αριθμός . Για παράγειγμα , το απόλυτο του -5 είναι 5 και το
 * απόλυτο του 5 ειναι 5
 */

public class AbsTernary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int abs = 0;

        //Input -  Είσοδος δεδομένων
        System.out.println("Please enter a number: ");
        num = scanner.nextInt();  //Data binding

        // επεξεργασια δεδομένων
//        if (num >=0 ) {
//            abs = num;
//        } else {
//           abs = -num;
//        }
        abs = (num >= 0) ? num : -num;  //expression - syntactic sugar
    }
}
