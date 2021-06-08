package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
    int floorNum = 7;
    if (floorNum == 1) {
        System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
       } else if (floorNum == 2){
        System.out.println("Floor 2 selected. Companies: Cybertek, Nasa, Intelsat");
       } else if (floorNum == 3){
        System.out.println("Floor 3 selected. Companies: Lyft, Bofa, Stake house");
       } else {
        System.out.println("Invalid floor");
       }

        System.out.println(" ======== SWITCH STATEMENT VERSION ======== ");

        floorNum = 4;
        switch(floorNum){
            case 1:          // same as floorNum == 1; if floorNum is 1 run this code
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;   //EXIT SWITCH
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, Nasa, Intelsat");
                break;   //exit the switch statement
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, Bofa, Stake house");
                break;
            default:
                System.out.println("Invalid floor - " + floorNum);
        }
    }
}
