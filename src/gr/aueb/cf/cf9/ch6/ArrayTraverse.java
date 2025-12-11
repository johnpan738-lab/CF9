package gr.aueb.cf.cf9.ch6;

/**
 * Traverse an array. Διάσχιση, επίσκεψη και εκτύπωση.
 */
public class ArrayTraverse {

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] grades = {10, 9, 8, 7, 6};
        int[] scores = new int[] {100, 90, 80, 70, 60};

        // Traverse arr1
        System.out.println("arr1 elements:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // Traverse grades
        System.out.println("\ngrades elements:");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        // Traverse scores
        System.out.println("\nscores elements:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }

        // Enhanced for (foreach) - grades
        System.out.println("\nEnhanced for - grades:");
        for (int grade : grades) {
            System.out.println(grade);
        }

        // Enhanced for (foreach) - scores
        System.out.println("\nEnhanced for - scores:");
        for (int score : scores) {
            System.out.println(score + " ");
        }
    }
}
