package gr.aueb.cf.cf9.ch17;

public class Main {

    public static void main(String[] args) {
        FlexibleNode flexibleNode = new FlexibleNode();

        flexibleNode.setValue("Coding");

        // Correct: retrieve as String
        String value = (String) flexibleNode.getValue();

        System.out.println(value);
    }
}
