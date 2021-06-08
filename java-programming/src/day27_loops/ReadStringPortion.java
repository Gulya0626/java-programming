package day27_loops;

public class ReadStringPortion {
    public static void main(String[] args) {

        String list = "cat,car,cat,red_car,java,selenium";

        for(int i = 0; i < list.length()-2; i ++) {
            System.out.println(list.substring(i, i+3));

            if(list.substring(i, i + 3).equals("cat") || list.substring(i, i + 3).equals("car")) {
                System.out.println("cat or car found");
            }
        }

//        //using substring print first 3 letters
//        int i = 0;
//        i++; //1
//        System.out.println(list.substring(i, i+3));
//        i++; //2
//        System.out.println(list.substring(i, i+3));
//        i++; //3
//        System.out.println(list.substring(2, 5));
//        i++; //4
//        System.out.println(list.substring(3, 6));
//        i++; //5
//        System.out.println(list.substring(4, 7));
    }
}