package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 25) {
            System.out.println(i);
            i++;
        }

        int apples = 0;
        while (apples <= 10) {
            System.out.println("apples -> " + apples);
            apples++;
        }
        System.out.println("apples = " + apples);
        
        int tomatoes = 5;
        while (tomatoes <= 10) {
            System.out.println("tomatoes = " + tomatoes);
            tomatoes++;
        }
        System.out.println("tomatoes = " + tomatoes);


        //infiniti loop
        while (true) {
            System.out.println("Hello world");
        }
    }
}
