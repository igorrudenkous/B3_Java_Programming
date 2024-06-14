package my_utilitis;

public class StringUtil {

    // reversing String
    public static String reversWord(String word) {
        String revers = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revers += word.charAt(i);
        }
        return revers;
    }

// return 1 ch UpperCase and rest in LowerCase
    public static String FixFormat (String str) {
        String result = "";
//        result = (str.charAt(0) + "").toUpperCase();      - same
        result = str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
        return result;
    }

// chek how many times chair there is in String
    public static int frequencyOfCraracter (String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
    //check valid userName
    public static boolean isValidUsername(String username) {
        return username.length() >= 6 && !username.contains(" ");
    }
}


