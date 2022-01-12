package day21ForEachLoop;

import java.util.Arrays;

public class UniqueElementsEachLoop {
    public static void main(String[] args) {


        String[] names = {"Asya", "Leyla", "Leyla", "Cydeo"};

        for (String each : names) {
            int count = 0;
         for(String element:names){
             if(element.equals(each)){
                 count++;
             }
         }
         if(count==1){
             System.out.println(each);
         }
        }


    }
    }

