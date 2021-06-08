package day40b_RiviewClass;

public class CountLetters {
    /**
     * Count letters
     * Create a method that will accept a String and print how many tomes each
     * character is found in the String
     * Ex:
     * Input: apple tree
     */

    public static void main(String[] args) {
        countLetters("apple tree");
    }

    public static void countLetters(String str) {
        String checked = "";


        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int count = 0;

            if (!checked.contains("" + eachLetter)) {

                for (int j = 0; j < str.length(); j++) {
                    char eachOtherLetter = str.charAt(j);
                    if (eachLetter == eachOtherLetter) {
                        count++;
                    }
                }
                System.out.println(eachLetter + "-" + count);
                checked += eachLetter + " ";
            }
        }
    }
}