package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class SwitchExpressionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = 0;
        char classification = ' ';

        System.out.println("Please enter a grade: ");
        grade = scanner.nextInt();

        classification = switch (grade) {
            case 1, 2, 3, 4 -> {
                System.out.println("Fail");
                yield 'A';
            }
            case 5, 6 -> 'B';
            case 7, 8 -> 'C';
            case 9, 10 -> 'D';
            default -> 'F';
        };

        System.out.println("Classification :" + classification);

    }
}
