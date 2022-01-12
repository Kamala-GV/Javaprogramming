package day_13;

import java.util.Scanner;

public class HomeTasksDay13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents");
        int inputCents, cents, dollars;
        inputCents = scan.nextInt();
        cents = inputCents % 100;
        dollars = inputCents / 100;
        System.out.println(dollars + "dollars " + cents + "cents");
       scan.close();


        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter miles");
        int inputMiles,miles,km;
        inputMiles=scan1.nextInt();
        km=inputMiles*1600;
        System.out.println(km);


    }
}

        /*Write a program that can convert Miles to KM
Ex:
Enter miles:
10.0
output:
10.0 miles equal to 16.09 kilometers*/





