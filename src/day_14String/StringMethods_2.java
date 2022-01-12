package day_14String;

import java.sql.SQLOutput;

public class StringMethods_2 {
    public static void main(String[] args) {
        String str= "Java is fun, I love learning Java";
        str= str.replace("Java", "Phyton");
        System.out.println(str);


        String s="Dog Dog Dog Dog";
              s=s.replace("Dog", "Cat");

        System.out.println(s);


        String str1="Kamala is a pretty boy";
        str1=str1.replace("boy",  "girl" );
        System.out.println(str1);


        String str2= "Lets go in";
        str2=str2.replace("in" , "out");
        System.out.println(str2
        );

        String name3="Kamala Guliyeva";
        name3=name3.replaceFirst("a", "e");
        System.out.println(name3);


        String word= "Kamala ";
        String word2=word.repeat(13);
        System.out.println(word2);
    }
}
