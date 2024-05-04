package day14_string;

public class removeSpace {
    public static void main(String[] args){
        String str = "    Thursday    ";
        System.out.println(str);

        System.out.println(str.length());

        str = str.trim();
        System.out.println(str.length());

        System.out.println("================================");

        String str2 = "      Java is fun     ";
        System.out.println(str2.length());
        str2 = str2.trim();
        System.out.println(str2.length());




    }
}
