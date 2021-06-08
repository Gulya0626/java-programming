package day19_class_vs_object_strings;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringCaseConversion {
    public static void main (String [] args) {
        String word = "Cybertek";
        String sentence = "Java IS Fun!";
        System.out.println(word);
        // convert word to all lowercase
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLCase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLCase);
        // change word to all lowercase letters and assign back
        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("Company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change variable company "Amazon" to "AMAZON"
        System.out.println("Company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);

        String planet = "Sun";
        System.out.println("Sun".toLowerCase()); //sun
        System.out.println(planet.toLowerCase()); //sun
        System.out.println(planet); //Sun
        planet = planet.toLowerCase(); //sun
        System.out.println("planet = " + planet);
    }
}
