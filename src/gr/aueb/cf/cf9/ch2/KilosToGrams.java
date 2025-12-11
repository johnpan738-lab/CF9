package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/** The user inserts the weight in kilograms , and the programma calculates
 * the weight in grams.
 */
public class KilosToGrams {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int weightInKilos = 0 ;
        int weightInGrams = 0 ;
        final int KILOGRAMS_TO_GRAMS = 1000;
        System.out.println("Παρακαλώ εισάγεται το βάρος σε κιλά");
        weightInKilos = scanner.nextInt();
        weightInGrams = weightInKilos * KILOGRAMS_TO_GRAMS;

        System.out.printf("Το βάρος σε γραμμάρια των %d κιλών είναι : %,d γραμμάρια", weightInKilos , weightInGrams);
    }
}
