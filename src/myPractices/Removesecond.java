package myPractices;
import java.util.ArrayList;

import java.util.Scanner;
public class Removesecond {


    public static ArrayList<String> removeEveryOther(ArrayList<String> words) {


        for (int i = 1; i <= words.size(); i++) {
            words.remove(i - 1);


        }


        return words;
    }


       public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println();
        int size = in.nextInt();
        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            System.out.println();
            list.add(in.next());
        }

        System.out.println(removeEveryOther(list));

    }
}

   /* public static ArrayList<String> removeEveryOther(ArrayList<String> words) {
        ArrayList<String> s = new ArrayList<>();
        int i = 1;
        for (String el : words) {
            if (i % 2 == 0) {
                s.add(el);
            }
            i++;
        }
        return s;
    }


*/

