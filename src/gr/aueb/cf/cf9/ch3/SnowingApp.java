package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/** the user inserts the temperature in Celsious , and the status of rainingg
 * variable and calculates if it is snowing or not . If it is raining and the teperature
 * is below 0 , it is snowing
 */

public class SnowingApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean IsRaining = false;
        boolean IsSnowing = false;

        System.out.println("Παρακαλώ εισάγεται αν βρέχει (true/false)");
        IsRaining = scanner.nextBoolean();
        System.out.println("Παρακαλώ εισάγεται την θερμοκρασία");
        temperature = scanner.nextInt();

        IsSnowing = IsRaining && (temperature < 0);

        System.out.println("Is Snowing " + IsSnowing);

    }
}
