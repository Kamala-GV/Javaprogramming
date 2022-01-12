package day_14String;

import java.util.Scanner;

public class ReplitMiddleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();

        String s=word.substring(2,5);

        if (word.length()%2==0 && word.length()<5){

            System.out.println("invalid");

        }else{
            System.out.println(s);
        }
    }
}
