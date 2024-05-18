package day08_newtopic;

public class Speeding {
    public static void main(String[] args) {
        int currentSpeed = 50;
        int speedLimit = 20;

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeding? " + isSpeeding);
    }
}
