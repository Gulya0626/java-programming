package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) {
        int count = 5;
        while(count >= 0) {
            System.out.println("Count = " + count);
            count--;
        }
        System.out.println("Finished the count");


        int unreadSMS = 10;

        /**
         * Read each message 1 by 1 until you have 0 unread sms
         */

        while(unreadSMS >= 1) {
            System.out.println("I have total " + unreadSMS + " \uD83D\uDC8C unread SMS");
            unreadSMS--;
        }
        System.out.println("No sms messages \uD83D\uDCE9");
    }
}
