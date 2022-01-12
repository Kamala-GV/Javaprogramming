package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class WarmupTasks {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 3, 4, 5, 6, 7, 8));


        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list);

        System.out.println("=====================================");


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 0, 4, 5, 0, 7, 8));
        int size = list1.size();
        list1.removeAll(Arrays.asList(0));

        int newSize = list1.size();
        int totalNumberOfZero = size - newSize;
        for (int i = 0; i < totalNumberOfZero; i++) {
            list1.add(0);

        }
        System.out.println(list1);

        System.out.println("===================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 0, 4, 5, 0, 7, 8));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : list2) {
            if (each != 0) {
                result.add(each);

            }
        }

            for (Integer each : list2) {
                if (each == 0) {
                    result.add(each);

                }

            }
            System.out.println(result);

        System.out.println("=========================================");

         String str="10%*#ABl238CGF";

         ArrayList<Character> chars=new ArrayList<>();

        for (int i = 0;  i<str.length() ; i++) {
            chars.add(str.charAt(i));
        }
            ArrayList<Character> letters=new ArrayList<>(chars);

            letters.removeIf(p-> !Character.isLetter(p));

                 System.out.println(letters);

        ArrayList<Character> digits=new ArrayList<>(chars);

        digits.removeIf(p-> !Character.isDigit(p));

                 System.out.println(digits);


        ArrayList<Character> specialChars=new ArrayList<>(chars);
        specialChars.removeAll(digits);
        specialChars.removeAll(letters);

        //specialChars.removeIf(p->,Character.IsDigitOrLetter(p); //
        System.out.println(specialChars);


    }

    }
