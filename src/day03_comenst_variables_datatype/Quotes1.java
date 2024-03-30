package day03_comenst_variables_datatype;

public class Quotes1 {
    public static void main(String[] args) {
        /*
            Q: How can you out/run/execute this:

            I like "java" programming.
        */

        System.out.println("I like \"java\" programming");
        System.out.println("\"This is a double quote\""); // "This is a double quote"

        /*
            Q: How about if I want to print the following

            The car has on\off button
         */

        System.out.println("The car has on\\off button");
        // The first backward slash is for the syntax
        // The second backward slash is for the text to be print out

        /*
            Q: How about if I want print out double backward slash

            The car has on\\off button
         */
        System.out.println("The car has on\\\\off button"); //  on\"off

        // For forward slash we do not need any escape sequence
        System.out.println("The password can be true/false");
    }
}


