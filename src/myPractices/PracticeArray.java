package myPractices;

import utilities.ArraysUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class PracticeArray {
    public static void main(String[] args) {

        String names = "mary monica good";  // regular string

        String[] arrayNames = names.split(" "); // convert string to array

        ArrayList<String> names1 = new ArrayList<>(Arrays.asList(arrayNames));// convert array to ArrayList
        names1.removeIf(p -> p.startsWith("g"));
        System.out.println(names1);
    }
}
