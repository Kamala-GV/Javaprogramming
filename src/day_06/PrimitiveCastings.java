package day_06;

public class PrimitiveCastings {
    public static void main(String[] args) {
        byte a = 100;
        short b = a;

        //     (short)a
        int c = b;
        // c =(int)b
        long d = c ;
        //(long)b
        float e = d;
        double f = e;

        double d1 = 20.5;
        short s1 = (short) d1;
        System.out.println(d1+ ";" + s1);

    }



}
