package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main (String [] args) {
        String carModel = "Jeep Wrangler";
        String driverName = "Batman";
        String licenseNum = "btm123";
        short speed = 80;
        boolean isAutomatic = false;
        char licenseClass = 'D';

        System.out.println ("Car model:  \t\t\t\t " + carModel );
        System.out.println ("Driver name:  \t\t\t\t " + driverName);
        System.out.println ("License number: \t\t\t " + licenseNum);
        System.out.println ("Speed: \t\t\t\t\t\t " + speed);
        // Current speed is : 90 mph
        System.out.println ("Current speed: \t\t\t\t " + speed + "mph");
        System.out.println ("Is it automatic? \t\t\t " + isAutomatic);
        System.out.println ("License class: \t\t\t\t " + licenseClass);
        System.out.println ("Is car automatic -> \t\t " + isAutomatic);

        String city = "Baltimore: "; // This works fine because city is String and population is int
        int population = 1200000;
        System.out.println(city + population);

    }
}
