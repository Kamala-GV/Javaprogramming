package day_14String;

public class StringMethod_3_SubString {
    public static void main(String[] args) {

        String word2= "Java Programming Language";

        String s1 = word2.substring(0,  word2.indexOf(" ") ); //"Python"

        String s2 = word2.substring( word2.indexOf(" ")+1 ,   word2.lastIndexOf(" ") ); //"C#"

        String s3 = word2.substring( word2.lastIndexOf(" ")+1  ); //"Language"
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        String word3 = "Kamala Guliyeva Vasif";
        String n1 = word3.substring(0  ,word3.indexOf(" ") );
        String n2 = word3.substring(word3.indexOf(" ")+1, word3.lastIndexOf(" "));
         String n3 = word3.substring(word3.lastIndexOf(" ")+1);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        String str3 = "Wooden Spoon";
        String brand=str3.substring(0, str3.indexOf(" "));

        System.out.println(brand);
        String brand1=str3.substring(str3.lastIndexOf(" ")+1);
        System.out.println(brand1);






    }
}
