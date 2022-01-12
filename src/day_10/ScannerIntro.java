package day_10;

import java.util.Scanner;
public class ScannerIntro {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer");
         int num1=input.nextInt();
        System.out.println("Enter a decimal");
           double num2= input.nextDouble();


        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiiplication:"+(num1*num2));

        input.close(); //closes the Scanner

    }
}

