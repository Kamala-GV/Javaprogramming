package day_16Loops;

import java.util.Scanner;

public class CountOFPositiveNegative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int pos = 0;
        int neg = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();

            if(num>=0){
                pos++;
            }else{
                neg++;
            }

        }
        System.out.println(pos+" positive number "+neg+" negative number");
    }
}