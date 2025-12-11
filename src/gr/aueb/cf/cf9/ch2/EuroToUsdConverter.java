package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήση ένα ποσό(ακεραιο) σε ευρώ
 * και το μετατρέπει σε δολλάριο ΗΠΑ με βάση την ισοτιμία .Για παράδειγμα ,
 * αν ο χρήστης δώσει 100 ευρώ και η ισοτιμία είναι 1 ευρω = 99 usa cents
 * τοτε τα συνολικά cents ειναι  9900 και αυτό αντιστοιχεί σε 99 usa dollars
 * και 0 usa cents
 */

public class EuroToUsdConverter {


    public static void main(String[] args) {
        //δηλωση και αρχικοποίση μεταβλητών

        Scanner scanner = new Scanner(System.in);

        final int Euro_To_Usd_Conversion_Rate = 99;

        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;

        System.out.println("Παρακαλώ εισάγεται ένα ποσό σε ευρώ");
        inputEuros = scanner.nextInt();

        //Data processing
        totalUsaCents = inputEuros * Euro_To_Usd_Conversion_Rate;
        usaDollars = totalUsaCents/100 ;
        usaCents = totalUsaCents % 100 ;

        System.out.printf("%d Euros = %d USD dollars και %d USD CENTS\n",inputEuros, usaDollars,usaCents);
    }
}
