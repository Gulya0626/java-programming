package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;

        for(int day = 1; day <= 30; day++) {
            if (totalCases % 7 == 0) { //sunday more cases
                totalCases += 500;
                System.out.println("day " + day + " | TOTAL CASES: " + totalCases);
            }else{
                totalCases += 200;
            }
        }
        System.out.println("JavaCuty 11/2021 Total Cases " + totalCases);


    }
}
