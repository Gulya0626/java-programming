package day54_abstraction;

public class Pizza extends MenuItem {

    @Override
    public void prepare() {
        System.out.println("Stretch the dough and put toppings and bake it");
    }

    @Override
    public void serve() {
        System.out.println("Serve in a plate or in a box");
    }
}
