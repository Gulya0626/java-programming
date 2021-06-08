package day42_arraylist;

import javax.xml.stream.events.Characters;
import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a', 'v', 'a', 'i', 's',
                'f', 'u', 'n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);

        System.out.println("reversed = " + letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max Char = " + Collections.max(letters));
        System.out.println("Min Char = " + Collections.min(letters));

        Collections.replaceAll(letters, 'i', 'j');
        System.out.println("After replaceAll = " + letters);

        Collections.sort(letters);
        System.out.println("After sort = " + letters);

        List<Integer> nums = Arrays.asList(23,1, 43, 5, 234, 7, -9,
                1, 5, 5, 5, 5);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int countOfFives = Collections.frequency(nums, 5);
        System.out.println("countOfFives = " + countOfFives);

        int countOf1s = Collections.frequency(nums, 1);
        System.out.println("countOf1s = " + countOf1s);

        Collections.replaceAll(nums, 5, 50);
        System.out.println("After replace all = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("After reverse all = " + nums);

        Collections.shuffle(nums);
        System.out.println("After shuffle = " + nums);


    }
}
