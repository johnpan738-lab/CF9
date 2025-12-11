package gr.aueb.cf.cf9.ch7;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class StrTrim {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstname = "";

        System.out.println("Please enter you first name");
        firstname = scanner.nextLine().trim();

        System.out.println("Your firstname is:" + firstname); //trimmed
    }
}
