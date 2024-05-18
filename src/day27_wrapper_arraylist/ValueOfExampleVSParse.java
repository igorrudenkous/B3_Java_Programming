package day27_wrapper_arraylist;

public class ValueOfExampleVSParse {
    public static void main(String[] args) {
        String s = "30";

        int num1 = Integer.parseInt(s);// converting String 30 in INT 30 [primitive]

        Integer num2 = Integer.valueOf(s); // converting String 30 into an Integer 30 [Wrapper Class/non-primitive/object type]

        int num3 = Integer.valueOf(s);

        System.out.println(num2);
        System.out.println(num3);

        Integer num4 = Integer.parseInt(s);



    }
}
