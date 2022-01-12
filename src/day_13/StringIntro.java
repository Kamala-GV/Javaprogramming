package day_13;

import java.sql.SQLOutput;

public class StringIntro {
    public static void main(String[] args) {
        String name= "Wooden Spoon";
        int n1 =name.length();
        System.out.println(n1);

        int lastIndex=name.length()-1;
        System.out.println(lastIndex);

        name=name.toLowerCase();
        System.out.println(name);

        String name2= "Kamala Guliyeva";
              name2=  name2.toUpperCase();
        System.out.println(name2);


        String name3="Kamala Guliyeva";
        name3=name3.replaceFirst("a", "e");
        System.out.println(name3);




    }
}
