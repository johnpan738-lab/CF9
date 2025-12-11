package gr.aueb.cf.cf9.ch3;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

/**
 * εμφανιζει ενα μενου μεχρι ο χρηστης να επιλέξει "Exit" τον αριθμό 3
 */

public class Menu2App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choise = 0;

        while (true) {
            System.out.println("Παρακαλώ επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. Εισαγωγή αίτησης");
            System.out.println("2. Διαγραφή αίτησης");
            System.out.println("3. Έξοδος");
            choise = scanner.nextInt();
            if (choise == 3) {
                break;
            }
        }
        System.out.println("Thanks for using the program");
    }
}
