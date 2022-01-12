package day21ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        System.out.println(Arrays.toString(num));
        System.out.println(num[3]);

        System.out.println("--------------------");



        int[] scores={90,95,75,65};
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("Min Score "+scores[0]);
        System.out.println("max score "+scores[scores.length-1]);


     String[] names={"Anna","Zuhal","Leyla","Ahmet"};
     Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        System.out.println("---------------");

        int[] arr1={1,3,2};
        int[] arr2={1,2,3};
        boolean r1=Arrays.equals(arr1,arr2);
        System.out.println(r1);
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);


        System.out.println("-----------");

        char[] ch1={'a','c','b'};
        char[] ch2={'b','a','c'};
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean anagram=Arrays.equals(ch1,ch2);
        System.out.println(anagram);

        System.out.println("--------------");




    }
}
