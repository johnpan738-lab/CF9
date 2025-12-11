package gr.aueb.cf.cf9.review.junior_level;

/**
 * οι μεταβλητες a και m δεν είναι καλά ονόματα
 * Ο κώδικας θα μπορουσε να είναι μέθοδος
 * Δεν έχει Documentation
 * Δεν υπαρχει ελεγχος για κενο array
 * Δεν έχει δομή
 * Δεν έχει SoC
 */
public class ArrayMax {

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 4, 5};
        int m = a[0];

        for (int i = 1; i < a.length; i++){
            if (a[i] > m){
                m = a[i];
            }
        }
        System.out.println(m);
    }
}
