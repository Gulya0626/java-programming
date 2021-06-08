package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars = 10;
        System.out.println("Cars in parking lot = " + cars);
        cars = cars + 2;
        System.out.println("Cars in parking lot = " + cars);
        cars += 5;
        System.out.println("Cars in parking lot = " + cars);

        //6 cars left the parking lot
        cars -= 6;
        System.out.println("Cars in parking lot = " + cars);

        int bikes1 = 10;
        bikes1 -= 2;
        System.out.println("Bikes in parking lot: " + bikes1);

        cars = cars - 1;
        cars -= 1;
        System.out.println("Cars in parking lot = " + cars);

        int electricCars = 13;
        //cars = cars + electricCars;
        cars += electricCars;
        System.out.println("electric cars in parking lot = " + cars);

        String word = "Java";
        System.out.println("Word is: " + word);
        word = word + " programming";
        System.out.println("Word = " + word);
        //add is " is fun ";
        word += " is fun ";
        word += " and interesting ";
        System.out.println("Word = " + word);

        String planets = "Mars is beautiful";
        planets += " and bright";
        System.out.println(planets);


        String selenium = "but selenium is more fun.";
        word += selenium;
        System.out.println("Word = " + word);

        word += 12345; //add 12345 to word
        System.out.println("word = " + word);

        word += " - I agree! ";
        System.out.println("Sentence: " + word);

        char letter = 'A';
        System.out.println("letter = " + letter);
        letter += 3;
        System.out.println("letter = " + letter);
        //add 'J' to letter;
        letter += 1;
        System.out.println("letter = " + letter);

        double parkingFee = 7.50;
        System.out.println("Normal parking fee = " + parkingFee);
        //early bird fee is 50 off
        // parkingFee = parkingFee / 2; //long way to do
        parkingFee /= 2; //short way to do
        System.out.println("Early bird parking fee = " + parkingFee);
        //weekend parking is free
        parkingFee -= parkingFee; //parkingFee = parkingFee - parkingFee
        System.out.println("Weekend parking fee = " + parkingFee);

    }
}
