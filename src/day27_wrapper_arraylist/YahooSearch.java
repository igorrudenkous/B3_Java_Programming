package day27_wrapper_arraylist;

public class YahooSearch {
    public static void main(String[] args) {
        // about 7,000,000 search results

        String result = "About 7,000,000 search results";
        String [] arr = result.split(" ");

        String resultStr = arr[1].replace(",", "");

        long resultNum = Long.parseLong(resultStr);

        if (resultNum >= 0) {
            System.out.println("TEST CASE PASSED - POSITIVE TEST CASE");
        } else {
            System.out.println("TEST CASE FAILED");

        }

        System.out.println("After searching for \"Apartments\" " + "I see " + resultNum);
        System.out.println("Next Year, after searching for \"Apartments\" " + "I will see " +  (resultNum + 1_000_000));

//TODO About 7,000,000 search results (0.54 seconds)
//TODO make sure your result near 0-2 seconds


    }


}
