package gr.aueb.cf.cf9.ch3;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/**
 * ο χρήστης εισάγει ακεραίους και
 * προσπαθεί να μαντέψει τα secret.
 */
public class SecretInterativeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int SECRET = 42;
        int num = 0;

        while (true) {
            System.out.println("Please guess the secret number: ");
            num = scanner.nextInt();

    //        if (num == SECRET){
    //            System.out.println("YOY GUESSED THE SECRET NUMBER");
    //            break;
    //        } else {
    //            System.out.println("TRY AGAIN!");
    //        }
            if (num != SECRET){
                System.out.println("Try again");
                continue;
            }
            System.out.println("Yoy guessed the secret number!!");
            break;
        }
    }
}
