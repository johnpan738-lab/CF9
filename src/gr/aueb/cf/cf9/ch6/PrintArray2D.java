public class PrintArray2D {
    public static void main(String[] args) {

        // Δημιουργούμε έναν 2D πίνακα 3x3
        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Εκτύπωση του πίνακα
        System.out.println("Ο πίνακας είναι:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // αλλαγή γραμμής μετά από κάθε σειρά
        }
    }
}