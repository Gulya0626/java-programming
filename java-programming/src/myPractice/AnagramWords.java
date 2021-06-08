package myPractice;

public class AnagramWords {
    public static void main(String[] args) {
        isAnagram("listen", "silent");
       

    }
    
    public static boolean isAnagram(String word1, String word2) {


        for(int i=0; i<word1.length();i++) {
            if(word2.indexOf(word1.charAt(i)) == -1) {
                return false;
            }
        }

        for(int i=0; i<word2.length();i++) {
            if(word1.indexOf(word2.charAt(i)) == -1) {
                return false;
            }
        }

        return true;
    }
}
