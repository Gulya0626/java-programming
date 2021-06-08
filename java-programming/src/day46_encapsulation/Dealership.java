package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        //new keyword
        Car car1 = new Car();
        //ERROR BELOW, MODEL and year are private and connot be accessed
        //car1.model = "Nissan Altima";
        //car1.year = 2020;
        car1.setModel("Nissan Altima");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(2020);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(45230);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println("car1 = " + car1); //automatically calls toString method

        Car alfaRomeo = new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia Ti AWD");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);

        System.out.println("Model = " + alfaRomeo.getModel());
        System.out.println("Year = " + alfaRomeo.getYear());
        System.out.println("Mileage = " + alfaRomeo.getMileage());
        System.out.println("alfaRomeo = " + alfaRomeo);
        //   System.out.println("alfaRomeo.toString() = " + alfaRomeo.toString());
        //   Above optional



    }
}
