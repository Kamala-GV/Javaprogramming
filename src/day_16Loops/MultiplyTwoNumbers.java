package day_16Loops;

import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("Enter a numbers :");
           int num1=cs.nextInt();
        System.out.println("Enter a number");
        int num2=cs.nextInt();
           int multiple =0;

            for(int i=1; i<=num2;i++){
                multiple+=num2;}
            if(num1>0&&num2>0){
                System.out.println("sum="+multiple);

            }else{
                System.out.println("invalid");
            }

            }

    }

