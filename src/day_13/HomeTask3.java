package day_13;

import java.util.Scanner;

public class HomeTask3 {
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);

        System.out.println("Enter the current speed limit");

     int speedLimit=55;
     int currentLimit;
        currentLimit=scan.nextInt();


     if(currentLimit>=55){
         System.out.println("Slow down");

     }else{
         System.out.println("Invalid result");

     }



    }

}
/*Write a program for the speed check. a variable named speedLimit is
given and assigned, ask user to enter the current speed, if the
current speed is over the speedLimit print slow down, otherwise do not
print anything
Ex:
speedLimit = 55;
Enter current speed:
105
output:
You're driving 50 mph over the limit. Slow down!*/