package day14_string;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        String expectedPassword = "loopcamp!";
        String expectedUsername = "JAVA";

        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter your username: ");
        String usernameFromUser = key.next(); // JAVA
        //usernameFromUser = usernameFromUser.toUpperCase(); // java

        System.out.print("Please, enter you password: ");
        String passwordFromUser = key.next();

        if (passwordFromUser.length() > 8
                && expectedPassword.equals(passwordFromUser)
                && expectedUsername.equalsIgnoreCase(usernameFromUser) ){ // JAVA vs java
            System.out.println("LOGGED IN");
        }


    }
}
