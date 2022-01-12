package day20Arrays;

import java.util.Arrays;

public class ArraysPracticeClass {
    public static void main(String[] args) {
        int[]numbers={10,20,50,60};
        System.out.println(Arrays.toString(numbers));


        int scores[]=new int[5];
        scores[1]=85;
        scores[4]=95;//or scores[scores.length-1]to find last index
        scores[3]=75;
        scores[0]=65;
        scores[2]=55;
     for(int i=0;i<scores.length;i++){
         System.out.println(scores[i]);
     }



    }
}
