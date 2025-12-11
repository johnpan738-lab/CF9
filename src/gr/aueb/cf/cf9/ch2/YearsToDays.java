package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * O χρήστσης δίνει την ηλικια του σε έτη και το προγραμμα επιστέφει την ηλικία του σε ημέρες
 */
public class YearsToDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int DAYS_IN_YEAR = 365;
        int intputAgeInYears = 0;
        int ageInDays = 0;

        System.out.println("Παρακαλώ εισάγετα την ηλικία σας");
        intputAgeInYears = scanner.nextInt();
        ageInDays = intputAgeInYears * DAYS_IN_YEAR;

        System.out.printf("Ηλικία σε έτη: %d, Ηλικία σε ημέρες: %d\n", intputAgeInYears, ageInDays);
    }
}
