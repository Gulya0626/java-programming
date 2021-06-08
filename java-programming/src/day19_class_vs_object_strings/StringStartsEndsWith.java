package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "Chicago city";

        System.out.println(word.startsWith("Chi"));
        System.out.println(word.startsWith("C"));
        System.out.println(word.startsWith("Chicago city"));
        System.out.println(word.startsWith("chi"));

        System.out.println(word.endsWith("City")); //false
        System.out.println(word.endsWith("c"));    //false
        System.out.println(word.endsWith("y"));    //true
        System.out.println(word.endsWith("city"));  //true



        String name = "Mr.Saim";

        if (name.startsWith("Mrs.")) {
            System.out.println("Missis");
        }else if (name.startsWith("Dr.")){
            System.out.println("Doctor.");
        }else if (name.startsWith("Mr.")){
            System.out.println("Mister");
        }else if (name.startsWith("Ms.")) {
            System.out.println("Miss");
        }else{
            System.out.println("Normal name");
        }
        System.out.println(name);


        /**
         * String url = "https://www.stackoverflow.com
         * .com --> "Commercial website"
         * .ru --> "Russian website"
         * .gov --> "Government website"
         * .edu --> "Education website"
         * .org --> "Organization website"
         */
         String url = "https://www.stackoverflow.com";
         if (url.endsWith(".com")) {
             System.out.println("Commercial website");
         }else if (url.endsWith(".ru")) {
             System.out.println("Russian website");
         }else if (url.endsWith(".gov")) {
            System.out.println();
         }else if (url.endsWith(".edu")) {
             System.out.println("Education website");
         }else if (url.endsWith(".org")) {
             System.out.println("Organization website");
         }


         String country = "KG";
         if(country.equals(country.toUpperCase())){
             System.out.println("Pass");
         }else{
             System.out.println("Incorrect");
         }

         String city = "BISHKEK";
         if(city.equals(city.toLowerCase())) {
             System.out.println("Matches");
         }else{
             System.out.println("Doesn't match");
         }






    }
}
