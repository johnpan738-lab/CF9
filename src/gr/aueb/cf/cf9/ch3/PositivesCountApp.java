package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * Count the number of positives numbers
 * How many loops will be needed is a case that
 * happenr @runtime .
 */
public class PositivesCountApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positives = 0;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        //διαβαζει μεχρι να βρει αρνητικο ακέραιο

        while (num >= 0) {
            positives++;
            System.out.println("Please enter a number: ");
            num = scanner.nextInt();

        }

        System.out.println("The count of positives numbers is: " + positives);
    }
}
