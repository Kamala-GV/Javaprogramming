package day_17WhileLoop;

import java.util.Scanner;

public class Hopetask2 {
    public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int sum = 0;
                int num = 0;
                do {
                    sum += num;
                    System.out.println("Enter a number");
                    num = scan.nextInt();
                } while (num >= 0);
                System.out.println("The sum of numbers is :" + sum);



    }
}
