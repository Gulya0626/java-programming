package day18_conditions_practice_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1, num2, num3;
        num1 = 100;
        num2 = 1000;
        num3 = 100;

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " is largest");
        }else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " is largest");
        }else{
            System.out.println(num3 + " is largest");

        }

        int n1 = 123;
        int n2 = 100;
        int n3 = 1000;

        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is largest");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is largest");
        } else if (n3 >= n1 && n3 >= n2) {
            System.out.println(n3 + " is largest");
        } else {
            System.out.println("Wrong entry");
        }
    }
}
