package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //cars list
        List<String> myCars = new ArrayList<>();
        myCars.add("Toyota");
        myCars.add("Mazda");
        myCars.add("Ford");
        myCars.add("Moskvich");
        myCars.add("Tesla");
        myCars.add(0, "Jeep");
        myCars.add("Lada");
        myCars.add("Yugo");

        //jeep, lada, yugo, toyota, mazda, ford, moskvich, tesla
        System.out.println(myCars.toString()); //prints all cars
        String allCarsIn1St = myCars.toString(); //saves all cars in 1 string variable.

        System.out.println("allCarsIn1St = " + allCarsIn1St);

        //change index 0 to Lamborghini
        myCars.set(0, "Lamborghini");
        System.out.println("After set = " + myCars.toString());

        myCars.set(4, "Ferrari");
        System.out.println("After set Moskvich = " + myCars.toString());

        /**
         * How would you do that if myCars was array:
         * myCars[4] = "Honda"
         */

        /**
         * String str = "java";
         * str.indexOf("v") ==> 2
         */
        //find the index number of "ford"
        System.out.println("Index of Ford = " + myCars.indexOf("Ford"));
        int FerrariIndex = myCars.indexOf("Ferrari");
        System.out.println("Ferrari Index = " + FerrariIndex);

        //change Ferrari to Jiguli
        myCars.set(FerrariIndex, "jiguli");
        System.out.println("after set to jiguli = " + myCars);

        //replace ford with trabant using single statement:
        //indexOf("ford), "trabant"

        myCars.set( myCars.indexOf("Ford") ,"trabant");
        System.out.println(myCars);


        /**
         * myCars contains "lada"
         * find index of lada and set value to bugatti
         * else
         * print "lada is not found"
         */

        if(myCars.contains("Lada")) {
            myCars.set(myCars.indexOf("Lada"), "bugatti");
        }else{
            System.out.println("Lada is not found");
        }

        System.out.println("After set bugatti = " + myCars.toString());

        /**
         * lamborghini -> prius
         * toyota -> lexus
         * trabant -> audi
         */

        for(int i = 0; i < myCars.size(); i++) {
            if (myCars.get(i).equals("Lamborghini")) {
                //change to prius
                myCars.set(i, "prius");
            } else if (myCars.get(i).equals("Toyota")) {
                myCars.set(i, "lexus");
            } else if (myCars.get(i).equals("trabant")) {
                myCars.set(i, "audi");
            }
        }
        System.out.println("After loop = " + myCars);
    }
}
