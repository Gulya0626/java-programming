package day20_string_manipulation;

public class ContainsMethod {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("ja")); //false
        System.out.println("Capital one".contains("on")); //true
        System.out.println(company.contains("ital")); //true

        if (company.contains(" ")) {
            System.out.println("multiple words company name");
        } else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy ";
        //check if " | " is in etsyTitle
        if (etsyTitle.contains(" | ")) {
            System.out.println("Title check passed");
        } else {
            System.out.println("Didn't pass");
        }

        String firstName = "ahmed";
        //check if firstName contains a and e at the same time
        if (firstName.contains("a") && firstName.contains("e")) {
            System.out.println("both a and e are present");
        }else{
            System.out.println("a || e are not present");
        }

        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("contains");
        }else{
            System.out.println("NOR a or i is present ");
        }



        String email = "Gulyakg@yahoo.com";
        if(email.contains("yahoo") && email.endsWith(".com")) {
            System.out.println("Valid email");
        }else{
            System.out.println("Not valid");
        }

        email = email.toLowerCase();
        // case insensitive contains
        if(email.toLowerCase().contains("o")) {
            System.out.println("o is present");
        }else{
            System.out.println("Doesn't contain");
        }
        System.out.println("email = " + email);

    }
}
