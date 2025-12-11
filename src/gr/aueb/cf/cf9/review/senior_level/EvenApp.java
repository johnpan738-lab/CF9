package gr.aueb.cf.cf9.review.senior_level;

import java.util.Scanner;

/**
 * This program calculates if a number is even or not
 */

public class EvenApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean result  = false;

        //Εισοδος δεδομενων,validation και Data Binding
        System.out.println("Please enter a number");
        while (!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter a number");
            scanner.nextLine();
        }
        num = scanner.nextInt();

// Επιχειρισιακη λογικη
        result = isEven(num);

//Εκτυπωση αποτελεσματος
        System.out.println("The number is even" + result);
    }

    /**
     * checks if a number is even.
     * @param num the number to check
     * @return true if the number is even, false otherwise.
     */

    public static boolean isEven(int num){
        return num % 2 == 0;
    }
}
