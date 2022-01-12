package customsMethodOverloading_day25;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,7};





        int[] arr1={1,5,8,9,23};
       int max1= ArraysUtility.max(arr1);
        System.out.println(max1);


        int[] numb={1,4,5,6,};
        boolean r3=ArraysUtility.contains(numb,5);
        System.out.println(r3);

    }
}
