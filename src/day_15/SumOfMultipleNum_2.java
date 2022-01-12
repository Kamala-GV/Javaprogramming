package day_15;

import java.util.Scanner;

public class SumOfMultipleNum_2 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        for (int i =0; i<5; i++) {
            sum += scan.nextInt();
        }
        System.out.println("sum=" + sum);


    }
}
