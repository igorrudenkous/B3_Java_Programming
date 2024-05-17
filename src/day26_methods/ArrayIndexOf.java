package day26_methods;

public class ArrayIndexOf {
    public static void main(String[] args) {

        int [] arr = {12, 3, 5, 73, 2, 5};

        String str = "Hello";
        System.out.println(indexOf(arr, 1515));



    }

    public static int indexOf (int [] array, int num) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf (String [] array, String word) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }
}
