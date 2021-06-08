package day19_class_vs_object_strings;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        // EQUALS() method - CASE SENSITIVE
        System.out.println(city.equals("Chicago")); // true
        System.out.println(city.equals("chicago")); //false
        System.out.println(city.equals("Chicago ")); //false

        // EQUALS IGNORE CASE () method - CASE INSENSITIVE
        //flexible comparison
        System.out.println(city.equalsIgnoreCase("Chicago")); //true
        System.out.println(city.equalsIgnoreCase("CHICAGO")); //true
        System.out.println(city.equalsIgnoreCase("Chicago ")); //false
        System.out.println(city.equalsIgnoreCase("cHicAgo"));  //true

        if (city.equals("CHICAGO")) {
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }

        if(city.equalsIgnoreCase("CHICAGO")){
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }

        String city2 = "Bishkek";
        System.out.println(city2.equals("Bishkek"));
        System.out.println(city2.equals(" Bishkek"));
        System.out.println(city2.equals("bishkek"));
        System.out.println("city2 = " + city2);

        System.out.println(city2.equalsIgnoreCase("bishkek")); //true
        System.out.println(city2.equalsIgnoreCase("bishkek ")); //false
        System.out.println(city2.equalsIgnoreCase("bIshkEk")); //true
        System.out.println(city2.equalsIgnoreCase("BISHKEK")); //true
        System.out.println(city2.equalsIgnoreCase("BISHKEk")); //true
        System.out.println(city2.equalsIgnoreCase("bish kek")); //false
        System.out.println("city2 = " + city2);

        //respect the space



    }
}
