package day11;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number");
        int inputSeconds,hours,minutes,seconds;


        inputSeconds=scan.nextInt();
        hours=inputSeconds/3600;
        int remainingSecondsAfterHour=inputSeconds%3600;
        minutes= remainingSecondsAfterHour/60;
        seconds= remainingSecondsAfterHour %60;
        System.out.println(hours+"hours,"+minutes +"minutes and,"+seconds+"seconds");





    }
}
