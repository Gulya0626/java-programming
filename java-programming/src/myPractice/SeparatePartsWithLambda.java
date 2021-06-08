package myPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SeparatePartsWithLambda {
    public static void main(String[] args) {

    /**
     * Separate Parts (Went through in office hours)Write a program that can extract the special characters,
     * digits and letters from a string and stores them into separate ArrayLists of Characters
     * Ex: str = "ABCD123$%#@&456EFG!"
     * list1: {$, %, #, @, &, !}
     * list2: {A, B, C, D, E, F, G}
     * list3: {1, 2, 3, 4, 5, 6}
     * Challenge: make a method that will do this action and it will return an ArrayList which holds all 3 of the
     * other ArrayListsChallenge 2: do the original task again, but without a loop. Use lambda
     */

    String str = "ABC9D123$%#@&456EFG!";
    List<Character> strList = new ArrayList<>();
        for(Character ch : str.toCharArray()) {
        strList.add(ch);
    }

        List<Character> list3 = strList.stream().filter(anything -> Character.isDigit(anything)).collect(Collectors.toList());
        System.out.println("Numbers: " + list3);
        List<Character> list2 = strList.stream().filter(symbols -> !Character.isLetterOrDigit(symbols)).collect(Collectors.toList());
        System.out.println("Symbols: " + list2);
        List<Character> list1 = strList.stream().filter(letters -> Character.isLetter(letters)).collect(Collectors.toList());
        System.out.println("Numbers: " + list1);


   }
}

