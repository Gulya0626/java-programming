package day56_abstraction.greeting;

public class Japanese implements Greeting {


    @Override
    public void hi() {
        System.out.println("Kon'nichiwa");
    }

    @Override
    public void bye() {
        System.out.println("Sayonara");
    }
}