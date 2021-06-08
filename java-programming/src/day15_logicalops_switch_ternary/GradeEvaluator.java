package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("PASSED WITH GRADE " + grade);
        } else if(grade == 'D'){
            System.out.println("QUALIFY FOR RETAKE WITH GRADE " + grade);
        } else if(grade == 'E'){
            System.out.println("FAILED " + grade);
        } else {
            System.out.println("INVALID GRADE");
        }
    }
}
