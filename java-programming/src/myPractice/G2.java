package myPractice;

public class G2 {
    public static void main(String[] args) {
        methods2("The sun set quickly and created a shadow");
    }

    public static void methods2(String s) {
        String a = s.substring(10);

        if(a.length() > s.length()) {
            System.out.println(a);
        } else {
            System.out.println(s);
        }

    }
}
