package day_15;

import java.util.Scanner;

public class MaxNUmberLoops {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648;
        for(int i = 0; i <5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num > max){
                max = num;
            }



        }
        System.out.println("max=" + max);
    }
}