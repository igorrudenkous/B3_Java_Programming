package day22_arrays_continuation;

import java.util.Scanner;

public class FriendList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Friends do you have? : ");
//        int friendsCount = input.nextInt();
        String [] friendList = new String[input.nextInt()];

        input.nextLine();
        for (int i = 0; i < friendList.length; i++) {
            System.out.println("Enter your friends name: ");
            friendList[i] = input.nextLine();

        }
        System.out.println("Their names are: ");
        for (String each : friendList) {
            System.out.println(each);
        }
    }
}
