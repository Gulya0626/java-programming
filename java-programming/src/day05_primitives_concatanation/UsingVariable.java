package day05_primitives_concatanation;

public class UsingVariable {
    public static void main (String [] args) {
        int num1 = 100;
        int num2 = num1;
        System.out.println (num1); // 100
        System.out.println (num2); // 100

        num1 = 200;
        System.out.println (num1); // 200
        System.out.println (num2); // 100

        int inthirasZipCode = 22182;
        int parvinsZipCode = inthirasZipCode;
        System.out.println (inthirasZipCode);
        System.out.println (parvinsZipCode);

        inthirasZipCode = 20007;
        parvinsZipCode =33131;
        System.out.println (inthirasZipCode);
        System.out.println (parvinsZipCode);

        int gulyasZipCode = 60004;
        int johnsZipCode = gulyasZipCode;
        System.out.println(gulyasZipCode);
        System.out.println(johnsZipCode);
        johnsZipCode = 88957;
        System.out.println(johnsZipCode);

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        /*
        n1 -> 55;
        n2 -> 55;
        n3 -> 55;
         */
        System.out.println (n1);
        System.out.println (n2);
        System.out.println (n3);

    }
}
