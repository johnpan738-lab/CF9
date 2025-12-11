package gr.aueb.cf.cf9.ch1;

/**
 * προσθετει 2 ακεραιους και εμφανιζει το αποτελεσμα
 */
public class AddApp {

    public static void main(String[] args) {

        // δηλωση και αρχικοποιηση μεταβλητων

        int num1 = 500_000;
        int num2 = 10_000;
        int result = 0;

        //εντολες
        result = num1 + num2;

        //Εκτυπωση αποτελεσματος

        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το αποτέλεσμα των: " + num1 + ", " + num2 + " =" + " είναι: "+ result);
        System.out.printf("Το άθροισμα των %,d, %,d είναι: %,d\n", num1, num2, result);

    }
}
