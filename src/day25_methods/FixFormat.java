package day25_methods;

import my_utilitis.StringUtil;

public class FixFormat {
    public static void main(String[] args) {
//        String str = "mIcKy";
        System.out.println(StringUtil.FixFormat("mIkky"));
        System.out.println(StringUtil.FixFormat("LOOPCAMP"));
    }

//    public static String FixFormat (String str) {
//        String result = "";
////        result = (str.charAt(0) + "").toUpperCase();      - same
//        result = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
//        return result;
//    }
}
