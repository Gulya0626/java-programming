package day21_string__manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub" , "lab"));
        System.out.println(word.toLowerCase());
        System.out.println("word = " + word);

        word = word.replace("hub","lab");
        System.out.println("word = " + word);

        //i -> o , a -> i
        System.out.println(word.replace('i', 'o').replace('a', 'i'));

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ","");
        System.out.println("withNoSpaces = " + withNoSpaces);

        //"java" replace to "selenium" , "fun" to "a lot of fun"
        withNoSpaces = sentence.replace("java" , "selenium")
                                .replace("fun" , "a lot of fun");
        System.out.println("withNoSpace = " + withNoSpaces);

        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over " , "").replace(" results for java book","").replace("," , "");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);
        count++;
        if(count > 0) {
            System.out.println("Search success");
        }
    }
}
