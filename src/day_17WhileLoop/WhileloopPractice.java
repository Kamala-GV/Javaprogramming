package day_17WhileLoop;

import java.util.Scanner;

public class WhileloopPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter username");
        String username= "Cydeo";
        int attempts=0;
        while(username.equals("Cydeo")){
            attempts--;
            System.out.println("invalid username ,please reenter");
        }



    }
}
