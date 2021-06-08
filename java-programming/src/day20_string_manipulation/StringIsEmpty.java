package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";

        System.out.println(jobTitle.isEmpty()); //true
        System.out.println(jobTitle.length()); //returns int, 0
        System.out.println(jobTitle.length() == 0); //true
        System.out.println(jobTitle.equalsIgnoreCase("")); //true


        if (jobTitle.isEmpty()) {
            System.out.println("Job title is empty");
        }else{
            System.out.println("Job title is not empty");
        }

        String veggie = "carrot";
        System.out.println(veggie.isEmpty()); //false
        //if veggie is not empty, print we have carrots

        if (veggie.length() == 0){ //veggie.isEmpty()
            System.out.println("We have carrot");
        }else{
            System.out.println("We don't have");
        }


    }
}
