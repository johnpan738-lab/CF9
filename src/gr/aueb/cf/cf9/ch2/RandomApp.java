package gr.aueb.cf.cf9.ch2;

/**
 * Παράγει εναν τυχαίο ακέραιο μεταξύ 1 - 6
 */
public class RandomApp {

    public static void main(String[] args) {

        int die = 0;

        die = (int) (Math.random() *6) +1 ;

        System.out.println(die);

    }
}
