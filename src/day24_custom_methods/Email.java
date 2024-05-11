package day24_custom_methods;

public class Email {
    public static void main(String[] args) {

        buildEmail("Mikky", "Mouse");
        buildEmail("Tommy", "Jerry");
    }

    public static void buildEmail (String fullName, String domain) {

        String email = fullName.toString().charAt(0)
                + fullName.toLowerCase().substring(fullName.indexOf(" ") + 1)
                + "@"
                + domain.toLowerCase()
                + ".com";
        System.out.println(email);
    }
}
