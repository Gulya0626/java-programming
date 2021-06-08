package day13_conditional_statements;

public class NiceDayOrNot {
    public static void main (String []args) {
        int temp = 72;

        if (temp >= 70) {
            System.out.println("It's a beautiful day");
            System.out.println("Let's code java");
        } else {
            System.out.println("It's kind of cold today");
            System.out.println("Stay home and code java");
        }
    }

    public static class YesOrNo {
        public static void main(String[] args) {
            System.out.println("Are you sure you want to delete this file?");
            char selection = 'y';
            boolean answer;
            String result;
            if (selection == 'y'){
                System.out.println("your file will be deleted");
                answer = true;
                result = "deleted";
            } else {
                System.out.println("file deletion");
                answer = false;
                result = "not deleted";
            }
            System.out.println("Did file get delete? - " + answer);
            System.out.println("Did file get delete? - " + result);

            char selection2 = 'L';
            boolean answer1;
            String result1;
            if (selection2 == 'G') {
                System.out.println("Your file will be deleted");
                answer1 = true;
                result1= "deleted";
            } else {
                System.out.println("File deletion cancelled");
                answer1 = false;
                result1 = "Not deleted";
            }
            System.out.println("Did file get deleted - " + answer1);
            System.out.println("Did file get deleted - " + result1);
        }
    }
}
