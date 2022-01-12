package day24CustomMethodsReturn;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Hometask2 {
    public static void main(String[] args) {
       isAnagram("Java","Phyton");




    }

    public static void isAnagram(String str1, String str2) {

        boolean anagram;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       if(ch1.equals(ch2)){
          anagram =true;
       }else
           anagram=false;

        System.out.println(anagram);

    }
}



