package gr.aueb.cf.cf9.ch7;

/**
 * Strings are cached in SCP (STRING CONSTANT POOL)
 * Or Intern Area for efficiency. Strings are immutable
 * In order to be secure, strings are immutable
 */

public class StrImmutable {

    public static void main(String[] args) {
        String str1 = "Coding";
        String str2 = "Coding";

        str2 = "Factory";

        System.out.println(str1);
        System.out.println(str2);
    }
}
