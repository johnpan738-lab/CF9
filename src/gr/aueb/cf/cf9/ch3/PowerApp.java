package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * calculates the power of a number , base ^ power
 * base ^ power= base * base * base *.....* base
 * (power φορες)
 */

public class PowerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i =1;


        System.out.println("Παρακλώ εισάγετε το base και το power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        //επεξεργασια δεδομενων - While - do
        while (i <= power){
            result *= base;
            i++;

        }

        // εκτυπωση αποτελεσματων

        System.out.printf("%d ^ %d = %d\n", base, power, result);

    }
}
