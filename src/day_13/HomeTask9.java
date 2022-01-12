package day_13;

import java.util.Scanner;

public class HomeTask9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an account number");
        String email1= scan.next();
        if(email1.charAt(0)=='2'&& email1.length()==7
                ||email1.charAt(0)=='5'&&email1.length()==10){
            System.out.println("account number is valid.");
        }else{
            System.out.println("Invalid account number");
        }


    }
}
