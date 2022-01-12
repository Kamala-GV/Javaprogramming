package day_17WhileLoop;

import java.util.Scanner;

public class Hometask3 {
    public static void main(String[] args) {

        int result=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number");
        int num=scan.nextInt();

        System.out.println("enter second number");
        int num1=scan.nextInt();
        int num2=0;
        num2=num1+num;
        while(num2>num1){
            num2=num2-num1;
            result++;
        }
        System.out.println(result
        );
    }
}
