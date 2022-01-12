package day20Arrays;

import java.util.Arrays;

public class ArraysMuhtarsTask {
    public static void main(String[] args) {
        String[] name={"Leyla Aliyeva","Rustam Guliev"};
          
        /*for(int i = 0; i < names.length; i++){
            String initials=names[i];//i: represents the index numbers of array starting from 0
            System.out.println( names[i].substring(0,1));*/
        for (String each : name) {
            String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }
        }
    }





