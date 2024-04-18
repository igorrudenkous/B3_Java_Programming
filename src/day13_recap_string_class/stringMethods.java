package day13_recap_string_class;

public class stringMethods {
    public static void main(String[] args) {
        String name1 = "Micky";
        String name2 = "Micky";
        String name3 = new String("Micky");

// compare memory locations
        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name2 == name3);



        System.out.println("___________________________________");

// compare value of Strings
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name2.equals(name3));

// also compare value of Strings
        System.out.println(name1.equals("Micky"));
        System.out.println(name1.equals(new String("Micky")));
        System.out.println("Micky".equals(name1));
        System.out.println(new String("Micky").equals(name2));

        System.out.println("___________________________________");

        String str1 = new String("Micky");
        String str2 = new String("Micky");
        System.out.println(str1.equals(str2));

        System.out.println("___________________________________");


        String last = "MONDA";
        int amountchars = last.length();
        System.out.println(last.length());
        System.out.println(amountchars + " - amount of chars");

        String word3 = "MONDAY";
        System.out.println(word3.equalsIgnoreCase(last));


    }
}
