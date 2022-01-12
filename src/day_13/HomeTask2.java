package day_13;

import java.util.Scanner;

public class HomeTask2 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter miles");
        double miles,km;
        miles=scan1.nextDouble();
        km=miles*1.609;
        System.out.println(miles+" miles equal to "+km+" km");
    }
}
