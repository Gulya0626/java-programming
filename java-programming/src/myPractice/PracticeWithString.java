package myPractice;

public class PracticeWithString {
    public static void main(String[] args) {
        String ta = "A";
        ta = ta + "B";
        String tb = "C";
        ta = ta + tb;
        ta.replace('C', 'D');
        System.out.println("t = " + ta);


        String str = "Hello world";
        str.trim();
        int z = str.indexOf(" ");
        System.out.println(z);


        String s1 = "wooden spoon";
        String s2 = s1.substring(s1.indexOf("s"));
        System.out.println(s2);


    }
}
