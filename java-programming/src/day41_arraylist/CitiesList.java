package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist. alt/option + enter
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist -> add methods
        cities.add("Washington DC"); //0
        cities.add("New York"); //1
        cities.add("Vienna"); //2
        cities.add("Adana"); //3
        cities.add("LA"); //4
        //add Ashgabat to 0 index
        cities.add(0, "Ashgabat");
        //print all values in same line
        System.out.println(cities);
        //print first and last city
        System.out.println("First city = " + cities.get(0));
        System.out.println("First city = " + cities.get(5));
        //find last index using size()-1
        System.out.println("Last city = " + cities.get(cities.size()-1));

        //print count of items in arraylist
        System.out.println("Count of items = " + cities.size());

        int size = cities.size();
        System.out.println("There are " + size + " cities in the list");

        //for loop and print all values in same line
        for(int i = 0; i < cities.size()/2; i++) {
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();

        for(String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();

        //delete item from arraylist
        //1) remove using index. Delete value at index 3
        cities.remove(3);
        //2) remove using objects/value
        cities.remove("New York");

        System.out.println("After removing = " + cities);

        //delete /remove all values from list
        cities.clear();
        //make sure it is clear
        //1) print it out
        System.out.println("Cities = " + cities);

        //2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("List is empty");
        }

        //3) check size() == 0;
        if(cities.size() == 0) {
            System.out.println("List is empty");
        }
    }
}
