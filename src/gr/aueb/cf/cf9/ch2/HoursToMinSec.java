package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Calculates Hous to Minutes and Seconds.
 * The user inserts the number of hours
 * And the programm calculates the number of minutes and seconds
 */

public class HoursToMinSec {

    public static void main(String[] args) {

        //Δηλωαη και αρχικοποιηση
        Scanner scanner = new Scanner(System.in);
        final int HOURS_TO_MINUTES = 60;
        final int HOURS_TO_SECONDS = 3600;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;

        //Εντολές
        //Πάρε input από τον χρήστη -- data binding
        System.out.println("Please insert the number of hours:");
        hours = scanner.nextInt();

        //Επεξεργάσου το input
        minutes = hours * HOURS_TO_MINUTES;
        seconds = hours * HOURS_TO_SECONDS;

        //Δώσε στον χρήστη το αποτέλεσμα
        System.out.printf(Locale.US,"The number of minutes is: %,d\n", minutes);
        System.out.printf(Locale.forLanguageTag("el"),"The number of seconds is: %,d\n", seconds);

    }
}
