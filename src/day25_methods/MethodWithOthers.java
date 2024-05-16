package day25_methods;

import my_utilitis.StringUtil;

import java.util.Scanner;

public class MethodWithOthers {
    public static String dayInWords(int dayNum) {
        String dayWord  = "";
        switch (dayNum) {
            case 1:
                dayWord = "One";
                break;
            case 2:
                dayWord = "Two";
                break;
            case 3:
                dayWord = "Three";
                break;
            case 4:
                dayWord = "Four";
                break;
            case 5:
                dayWord = "Fife";
                break;
            default:
                dayWord = "invalid";
        }
        return dayWord;
    }
    public static void main(String[] args) {
        System.out.println(dayInWords(1));
        String matrix = StringUtil.reversWord("Matrix");
        System.out.println(matrix);
    }

}
