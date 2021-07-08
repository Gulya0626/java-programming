package practice_with_aizat;

public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int temp = num;
        int lastDigit = 0;
        int ReverseNum = 0;


        while (temp != 0) {
            lastDigit = temp % 10;
            System.out.print(lastDigit);

            ReverseNum = ReverseNum * 10 + lastDigit;
            // 0 * 10 + 1 = 1;
            // 1 * 10 + 2 = 12;
            // 12 * 10 + 3 = 123;
            // 123 * 10 + 2 = 1232;
            // 1232 * 10 + 1 = 12321;

            temp = temp / 10;


        }
            if(ReverseNum == num) {
                System.out.println("Number is palindrome");
            }else{
                System.out.println("Number is NOT palindrome");
            }
        }
    }
