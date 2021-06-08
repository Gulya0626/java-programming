package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        // 1 + 2 + 3 + 4 + 5
        for(int i = 1; i <= 10; i++) {
        System.out.println(i);
        sum += i; //sum = sum + i;

       }

        System.out.println("Sum = " + sum);
    }
}

