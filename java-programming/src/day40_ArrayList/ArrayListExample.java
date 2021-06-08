package day40_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        //nums.add("java"); ERROR, no string only Integer

        System.out.println("The size = " + nums.size());

        //reading from arraylist
        System.out.println("index o = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
        //System.out.println(nums.get(3)); indexOutOfBoundException

        //print all values in same line:
        System.out.println(nums); //Arrays.toString(numArray)

        nums.remove(1); //remove element at index 1
        System.out.println(nums);


    }
}
