package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("Count: " + word.length());
        System.out.println("Wooden spoon".length());

        String firstName = "Nadir";
        System.out.println(firstName + "-" + firstName.length());

        int count = firstName.length();
        System.out.println("Count = " + count);

        String password = "abc1235";

        /** if statement:
         * when password is at least 6 characters:
         * print: valid amazon password
         * else
         * print: password too short
         */

        if (password.length() >= 6) {
            System.out.println("Valid amazon password");
        } else {
          System.out.println("Password too short");
      }
    }
}
