package myPractice;

public class Practice {
    public static void main(String[] args) {
        int num = -5;
        System.out.println(num++ + ",");
        System.out.println(num = 0);
        System.out.println("," + --num);
        
        short s = 13 - 9 / 3 * 10;
        s += -10;
        System.out.println("s = " + s);

        boolean one = ('a' != 'z') && false; //false
        boolean two = one || 0 == (9-10+1); 
        System.out.println("two = " + two);
        
        long l = 100;
        short g = (short) l;
        System.out.println(g + 10);
        
        int k = 10;
        k = --k + k++ + k-- + k++;
        System.out.println("k = " + k);

        byte spoon = 104;
        boolean check = spoon < 100;
        if(check) {
            spoon -= 100;
        }else{
            spoon = 50;
        }


        int cookies = 10;
        String day = "tuesday";

        switch(day) {
            case "sunday":
                cookies++;
            case "monday":
                cookies += 5;
                break;
            case "tuesday":
            case "wednesday":
                cookies += 10;
            case "thursday":
                cookies += 5;
                break;
            case "friday":
                break;
            case "saturday":
                cookies--;
                break;
                default:
                cookies = 0;
        }
        System.out.println(cookies);
        
        
        double pi = 3.14;
        boolean b = 119% 5 == 0;
        int num2 = 0;
        
        if (pi>3.14 && !b){
            num2 += 50;
        }else{
            num2 -=50;
        }
        if(b){
            num +=50;
        }
        System.out.println("num2 = " + num2);
        
        
        double decimal = 13.142;
        int whole = decimal < 20 ? 20 : 10;
        System.out.println("whole = " + whole);


        int check1 = 132;
        String str = "";
        if(check1 % 2 == 0){
            str += check;
            if(check1 %5 == 0){
                str += "132";

            }else{
                str= "500";

            }
        }else{
            str += "123";
        }
        System.out.println("str = " + str);




        int num8 = 2;
        boolean b1 = true;

        switch (num8){
            case 0:
                b1 = false;
            case 1:
                System.out.println(1);
                case 2:
                    if(b1){
                        System.out.println(2);
                    }else{
                        b1 = false;

                    }
            case 3:
                if(b1) {
                    System.out.println(3);
                    b1 = false;

                }else{
                    break;
                }
            case 4:
                System.out.println(4);
            case 5:
                if(!b) {
                    break;
                }

        }



    }
}
