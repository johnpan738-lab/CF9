package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * ο χρήστης προσπαθεί να βρει εναν secret number.
 */

public class SecretApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        System.out.println("Please guess the secret number: ");
        num = scanner.nextInt();

        if(num == SECRET) {
            System.out.println("You guessed the secret number!");
        }else {
            System.out.println("You dii not guessed the secret number");
        }

    }
}
