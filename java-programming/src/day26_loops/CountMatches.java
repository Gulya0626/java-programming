package day26_loops;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'a';
        int count = 0;

        for(int g = 0; g < word.length(); g++) {
            if(word.charAt(g) == letter) {
                count++;
                System.out.println("There are " + count + " "+  letter + " ");
            }
        }
    }
}
