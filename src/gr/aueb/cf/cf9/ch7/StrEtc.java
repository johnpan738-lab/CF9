package gr.aueb.cf.cf9.ch7;

public class StrEtc {

    public static void main(String[] args) {

        //traverse as array
        String s = "Coding Factory";
        for (char ch : s.toCharArray()) {
            System.out.println(ch + " ");
        }

        System.out.println("\u2764");
    }

    //Replace
    String firstName = "Maria-Helen";
    String simpleName = firstName.replace("-", " ");

    //Concat
    String lastname = "Smith";
    String fullName1 = firstName + " " + lastname;
    String fullName2 = firstName.concat(" ").concat(lastname);
}
