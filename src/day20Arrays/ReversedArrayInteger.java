package day20Arrays;

import java.util.Arrays;

public class ReversedArrayInteger {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for(int i = 0, j =5;  i < numbers.length; i++, j--){
            numbers[i] = j;
        }
        System.out.println(Arrays.toString(numbers));


        System.out.println("------------------");


        int[] number ={1,3,5,6,7};
        int [] reverse=new int[number.length];


        for(int i=number.length-1,j=0;i>=0;i--,j++){
            reverse[j]=number[i];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
