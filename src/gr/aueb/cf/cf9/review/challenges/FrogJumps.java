package gr.aueb.cf.cf9.review.challenges;

public class FrogJumps {

    public static void main(String[] args) {
        int start = 10;
        int end = 55;
        int jump = 25;

        int result1 = frogJumps(start, end, jump);
        int result2 = frogJumps2(start, end, jump);

        System.out.println("frogJumps result = " + result1);
        System.out.println("frogJumps2 result = " + result2);
    }

    public static int frogJumps(int start, int end, int jump) {
        int jumpCount = 0;

        while (start < end) {
            start += jump;
            jumpCount++;
        }
        return jumpCount;
    }

    public static int frogJumps2(int start, int end, int jump) {
        return (int) Math.ceil((end - start) / (double) jump);
    }
}