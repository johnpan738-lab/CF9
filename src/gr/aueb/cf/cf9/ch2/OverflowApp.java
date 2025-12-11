package gr.aueb.cf.cf9.ch2;

/**
 * προσθετει 2 ακεραιους και το αποτέλεσμα δημιουργει υπερχείληση
 *
 */
public class OverflowApp {

    public static void main(String[] args) {
        //δηλωση και αρχικοποιηση μεταβλητων
        int num1 = Integer.MAX_VALUE;
        int num2 = 1;
        int result = 0;

        // εντολές
        result = num1 + num2;

        //Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);

    }
}
