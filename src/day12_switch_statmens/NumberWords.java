package day12_switch_statmens;

public class NumberWords {

    public static void main(String[] args) {
        int num = 3;

        if (num ==1) {
            System.out.println("one");
        } else if (num == 2) {
            System.out.println("two");
        } else if (num == 3) {
            System.out.println("three");
        } else if (num == 4) {
            System.out.println("four");
        } else if (num == 5) {
            System.out.println("five");
        } else {
            System.out.println("not corect");
        }

       switch (num) {
           case 1:
               System.out.println("One");
               break;
           case 2:
               System.out.println("Two");
               break;
           case 3:
               System.out.println("Tree");
               break;
           case 4:
               System.out.println("Four");
               break;
           case 5:
               System.out.println("Five");
               break;
           default:
               System.out.println("not corect");



       }



    }
}
