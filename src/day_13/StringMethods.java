package day_13;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String st = scan.next();
        char first = st.charAt(0);
        char last = st.charAt(st.length()-1);
        System.out.println(first==last);




    }

    }


