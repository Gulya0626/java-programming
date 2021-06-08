package day50_inheritance;

public class Person {

    String name;
    int age;

    public void walk() {
        System.out.println(name + " is walking to on the street");

    }
    public void talk() {
        System.out.println(name + " is talking on the phone with a mom");

    }
    public void work(String job) {
        System.out.println(name + " is working 12 hours a day as a " + job);
    }
}
