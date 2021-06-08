package OfficeHours.Practice_03_29_2021;

public class MiddleChar {
    public static void main(String[] args) {
        String word = "apple";

        if(word.length() % 2 == 1){
            //odd
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2, word.length()/2 + 1));
        }else{
            //even
            int index = word.length()/2;
            System.out.println(word.charAt(index-1) + "" + word.charAt(index));
            System.out.println(word.substring(index-1));
        }
    }
}
