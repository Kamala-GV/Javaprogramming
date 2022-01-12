package day24CustomMethodsReturn;

import java.sql.SQLOutput;

public class Hometask1 {
    public static void main(String[] args) {
        String result =frequencyOfWord("Java, Java Java Phyton","Phyton");
        System.out.println(result);

    }
    public static String frequencyOfWord(String sentence,String word){

        int frequency=0;
        sentence.split(" ");
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.contains(word)) {
                frequency+=1;

            }
        }

        return frequency+"";
    }




}
