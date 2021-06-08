package day21_string__manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char third = word.charAt(2);

        if (first == third) {
            System.out.println("first and last match");
        }else{
            System.out.println("first and last mismatch");
        }

        if (word.charAt(0) == word.charAt(2)) {
            System.out.println("first and last letters match");
        }else{
            System.out.println("mismatch");
        }

        String friend = "aziza";
        char firstLetter = friend.charAt(0);
        // char lastLetter = friend.charAt(3);
        char lastLetter = friend.charAt(friend.length() -1 );

        System.out.println(firstLetter);
        System.out.println(lastLetter);

        if (firstLetter == lastLetter){
            System.out.println(friend + " - first and last match");
        }else{
            System.out.println(friend + " - first and last mismatch");
        }
    }
}
