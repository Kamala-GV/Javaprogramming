package day_14String;
import java.sql.SQLOutput;
import java.util.Scanner;
public class FirstHalfReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.next();
        String s=word.substring(0,2);

        System.out.println(word.substring(0,2)+word.substring(0,2));

    }
}
