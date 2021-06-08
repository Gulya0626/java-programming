package day11_comparison_operator;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {

        int girl = 32;
        int boy = girl++;
        System.out.println(girl); //33
        System.out.println(boy); //32

        int baby = 12;
        int toddler = ++baby;
        System.out.println(baby); //13
        System.out.println(toddler); //13

        //PRE-INCREMENT
        int num1 = 10;
        // ++num1;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //POST-INCREMENT
        int num3 = 4;
        int num4 = num3;
        num3++;
        System.out.println("num3 = " + num3); //5
        System.out.println("num4 = " + num4); //4
        
        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples); //6
        System.out.println("basket = " + basket); //6

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int tomatoes = 20;
        int potatoes = tomatoes++;
        // tomatoes++;
        System.out.println(tomatoes); //21
        System.out.println(potatoes); //20

        int cars = 5;
        System.out.println(++cars); //6

        int sedans = 10;
        System.out.println(sedans++); //10
        System.out.println(sedans); //11

        int myNumber = 44;
        myNumber++;
        System.out.println(myNumber); //45
        ++myNumber;
        System.out.println(myNumber); //46

        myNumber = 20;
        //add 1 first then print value
        System.out.println(++myNumber); //21

        myNumber = 60;
        System.out.println(myNumber++); //60
        System.out.println(myNumber); //61

        int a = 50;      //51
        int b = 22;      //23
        int c = a++ + ++b;  //73
        // -> adds 1 to a here, at this step afterwards
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c); // 50+23=73

        int d = 88; //89
        int e = 100; //101
        int f = ++d + e++;  //189
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = "+ f);

        int g = 100;
        int g1 = g++;
        System.out.println(g); //101
        System.out.println(g1); //100

        int k = 55;
        int p = ++k;
        System.out.println(k); //56
        System.out.println(p); //56

        double h = 1046.77;
        double l = h++;
        System.out.println(h); //1047.77
        System.out.println(l); //1046.77

    }
}
