package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        //break statement

        for(int n = 1; n < 5; n++) {
            System.out.println(n);
            if(n == 3) {
                break;
            }
        }
        System.out.println();

        for(int i = 1; i <= 5; i++) {
            System.out.println();
        }


    }
}
