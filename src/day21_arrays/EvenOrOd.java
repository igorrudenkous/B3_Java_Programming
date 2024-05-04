package day21_arrays;
/*
    Even and odd from array
    Write a program that can count the even and odd number from an array of integers
    Ex:
    Input: [4,1,3,12,5]
    Output:
    Even: 2
    Odd: 3
 */
public class EvenOrOd {
    public static void main(String[] args) {
    int [] nums = {4, 1, 3, 12, 5, 20, 13};
    int evenCount = 0;
    int oddCount = 0;
    String oddStr = "";
    String evenNum = "";

        for (int eachNum : nums) {

            if (eachNum % 2 == 0) {
                evenCount ++;
                evenNum += eachNum + " ";
            } else {
                oddCount ++;
                oddStr += eachNum + " ";
            }
        }
        System.out.println(evenCount);
        System.out.println(oddCount);
        System.out.println("Even: " + evenNum);
        System.out.println("Odd: " + oddStr);
        }
    }

