package day_16Loops;

import java.util.Scanner;

public class reversed_loop_replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        String result = "";
        if (word.length() <5) {
            System.out.println("Too short!");
        } else if (word.length()>5) {

            System.out.println("Too long!");
        } else {
            for (int i = word.length() - 1; i >= 0; i--) {
                result += word.charAt(i);

            }
            System.out.println(result);

        }
    }
}
