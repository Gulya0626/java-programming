package day44_custom_classes;

public class Animal {
    String type = "some animal";

    public void eat() {
        System.out.println(type + " is eating");
    }
    public void sleep() {
        System.out.println("The " + type + "is sleeping");
    }

    public void eat(String food) {
        System.out.println("Eating " + food);
    }

    public void speak() {
        System.out.println("Speak");
    }

    public void dance(String danceName){
        System.out.println("Dance: " + danceName);
    }
}
