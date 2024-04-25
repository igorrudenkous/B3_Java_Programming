package day16_loops;

import javax.naming.ldap.LdapReferralException;

public class replaseMethod {
    public static void main(String[] args) {
        String s = "java is a languege";
        s = s.replace('a', 'e');
        System.out.println(s);

        String day = "Today is Wednesday. We will do practise. It is Wednesday";
        day = day.replace("Wednesday", "Today");
        System.out.println(day);

        int firstDot = day.indexOf(".");
        int lastDot = day.lastIndexOf(".");

        String middle = day.substring(firstDot + 1, lastDot).trim();
        System.out.println(middle);


    }

}
