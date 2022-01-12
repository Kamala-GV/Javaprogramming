package day23CustomMethods;

import java.util.ArrayList;

public class CustomMethodsAnagram {


    public static void isAnagram(String word1, String word2) {

        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            for (int j = 0; j < word1.length(); j++) {
                char ch1 = word2.charAt(j);
                boolean anagram =ch==ch1;
            }
        }
            System.out.println();



        }


    }

