package day_13;

import java.util.Scanner;

public class HomeTask6 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        if(word.startsWith("x")){
            System.out.println("code");
        }

    }
}
/*Ask user to enter a word.
If the work starts with x,
print the word without x.
                    Input:
                        xcode
                    Output:
                        code */