package day_17WhileLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hometask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();
        int result=0;
        System.out.println("Enter a math operator");
        char ch = scan.next().charAt(0);
        while (!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
            System.out.println("re enter please");
            ch = scan.next().charAt(0);
            System.out.println();
        }
        switch (ch) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '*':
                result = num1 * num2;
                break;
        }
        System.out.println(num1 + " " + ch + " " + num2 + " = " + result);
        scan.close();
    }
}
