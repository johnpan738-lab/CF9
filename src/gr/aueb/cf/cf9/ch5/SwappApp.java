package gr.aueb.cf.cf9.ch5;

/**
 * Ορίζει μια μέθοδο void swap (int a, int b) η οποία
 * θα εναλλάσει αμοιβαία τις τιμές a,b
 */

public class SwappApp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.printf("a = %d, b = %d\n", a, b);
        swap(a,b);

        System.out.printf("a = %d, b = %d\n", a, b);

    }

    /**
     * swap two numbers
     * @param a the first number
     * @param b the second number
     */

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

    }
}
