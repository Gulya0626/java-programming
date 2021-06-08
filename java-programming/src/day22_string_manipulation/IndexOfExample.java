package day22_string_manipulation;

public class IndexOfExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
        // first comma
        System.out.println(technologies.indexOf(",")); //4
        // last comma
        System.out.println(technologies.lastIndexOf(",")); //40
        //for middle one, we need to loop
        int indexOfJava = technologies.indexOf("java");
        System.out.println("java is at index " + indexOfJava);

        int idxOfCss = technologies.indexOf("css");
        System.out.println("css is at index " + idxOfCss);

        int indexOfCucumber = technologies.indexOf("cucumber");
        System.out.println("cucumber is at index " + indexOfCucumber);

        int indexOfSql = technologies.indexOf("sql"); //not present -1
        System.out.println("sql is at index " + indexOfSql);

        //technologies contains "maven" ?
        if(technologies.contains("maven")){
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }

        if (technologies.indexOf("maven") > -1) {
            System.out.println("maven is present");
        }else{
            System.out.println("maven is not present");
        }


        String item = "lipstick, pencil, cream";
        System.out.println(item.indexOf("lipstick"));
        System.out.println(item.indexOf("pencil"));
        System.out.println(item.indexOf("cream"));
        System.out.println(item.indexOf(","));
        System.out.println(item.lastIndexOf(","));
        int indexOfLipstick = item.indexOf("lipstick");
        System.out.println("The lipstick is at index " + indexOfLipstick);
        int indexOfCream = item.indexOf("cream");
        System.out.println(indexOfCream);
        int indexOfPowder = item.indexOf("powder");
        System.out.println(indexOfPowder);

        if(item.indexOf("lipstick") > -1){
            System.out.println("Lipsticks is there");
        }else{
            System.out.println("It's not there");
        }

    }
}
