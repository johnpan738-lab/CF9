package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει την δύναμη a^b με μέθοδο.
 */

public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.println("Please enter two numbers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("a^b =" + pow(a, b));

    }

    public static int pow(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

}
