package day10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);

        int lipstick = 50;
        lipstick = lipstick + 10;
        lipstick += 10;
        lipstick++;
        ++lipstick;
        lipstick++;
        ++lipstick;
        System.out.println("Total lipstick price: $" + lipstick);

        int linesOfCode = 15;
        System.out.println("linesOfCode = " + linesOfCode);
        //increase linesOfCode by 1 , 4 different ways that we learnt today
        linesOfCode = linesOfCode + 1;
        linesOfCode += 1;
        linesOfCode++;
        ++linesOfCode;
        //++linesOfCode++; ERROR
        System.out.println("linesOfCode = " + linesOfCode);

        //TYPE 4 DIFFERENT WAYS OF DECREASING BY 1

        linesOfCode = linesOfCode - 1;
        linesOfCode -= 1;
        linesOfCode--;
        --linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);

        char letter = 'a';
        System.out.println("Letter = " + letter);
        letter++;
        ++letter;
        System.out.println("Letter = " + letter);
        letter --; --letter; ++letter;
        System.out.println(letter);
    }
}
