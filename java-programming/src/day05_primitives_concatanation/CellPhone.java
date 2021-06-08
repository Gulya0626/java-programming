package day05_primitives_concatanation;

public class CellPhone {
    public static void main (String [] args) {
        String brand = "Apple";
        String model = "iPhone11";
        String color = "gold";
        double price = 699.0;
        int storage = 256;
        boolean hasCamera = true;

        System.out.println (brand);
        System.out.println (model);
        // WITH MESSAGE
        System.out.println ("Brand is " + brand);
        System.out.println ("The model is " + model);
        System.out.println ("The color is " + color);
        System.out.println ("The price is $" + price);
        System.out.println ("The storage is " + storage + "GB");
        System.out.println ("Has camera? - " + hasCamera);
        System.out.println ("");

        String dress = "floor lengths";
        String Brand = "\"Dolce & Gabbana\"";
        char size = 'S';
        String Color = "green";
        double Price = 1099;
        // WITH MESSAGE

        System.out.println("It's a " +  dress + " A-line dress");
        System.out.println("The brand is " + Brand);
        System.out.println("The size is " + size);
        System.out.println("The color is " + Color);
        System.out.println("The price is $" + Price);
    }
}
