package day18_conditions_practice_strings_intro;

public class CarLeasing {
    public static void main(String[] args) {
        String Make = "Mercedes";
        String Model = "A4";
        int leasePrice = 0;

//        if(Make.equals("Mercedes") && Model.equals("E")){
//            leasePrice = 500;
//        }else if (Make.equals("Mercedes") && Model.equals("A")) {
//            leasePrice = 400;
//
//            convert to nested if

        if(Make.equals("Mercedes")){
            if (Model.equals("A4")){
                leasePrice = 500;
            } else if (Model.equals("E")){
                leasePrice = 400;
            }
        }else{
            System.out.println("Invalid make");
            //return means exit program / exit main method
        }
        System.out.println("Make = " + Make);
        System.out.println("Model = " + Model);
        System.out.println("leasePrice = " + leasePrice);
    }
}
