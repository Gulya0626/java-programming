package OfficeHours.Practice_03_08_2021;

public class CastingPractice {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (short)d;
        int i2 = (int)d;
        System.out.println(i);

        float f = 3.54F;
        float f2 = (float)3.54; //float = (float)double

        float f3 = 5; //float = int -> 5.0
        float f4 = 5.5f;

        long l = 22313; // long = int
        long l2 = 3127657367867856L;
        /*
        by default whole numbers will be read as int database
        by default decimal numbers will be read as double database
         */



    }
}
