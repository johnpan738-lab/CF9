package gr.aueb.cf.cf9.review.challenges;

/**
 * Έστω πίνακας με n στοιχεία από 1 έως n+1
 * Για παράδειγμα [1, 2, 3, 5]
 * Βρείτε το στοιχείο που λείπει.
 */
public class MissingElement {

    public static void main(String[] args) {

    }

    public static int findMissingElement(int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n = arr.length;
        expectedSum = (n * (n + 1)) / 2;

        for (int item : arr) {
            actualSum += item;
        }
        return expectedSum - actualSum;
    }
}