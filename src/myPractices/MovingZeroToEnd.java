package myPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class MovingZeroToEnd {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 3, 0, 5, 0, 4, 0, 8, 0));

        ArrayList<Integer> result=new ArrayList<>();
        for (Integer integer : list) {
            if (integer!=0){
                result.add(integer);
            }

        }


        for (Integer integer : list) {
            if (integer==0){
                result.add(integer);
            }

        }
        System.out.println(result);


        System.out.println("===============================================");



        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 3, 0, 5, 0, 4, 0, 8, 0));

      int size= list1.size();

      list1.removeAll(Arrays.asList(0));
        System.out.println(list1);


        int newSize=list1.size();

        int totalZeros=size-newSize;
        System.out.println(totalZeros);

         for(int i=0; i<totalZeros;i++){
             list1.add(0);

        }
        System.out.println(list1);


    }
}
