package muhtarsTasks;

import java.util.Scanner;

public class CalculateTwonumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter first number");
            int number = scan.nextInt();
            System.out.println("Enter a math operator; *,-,/,*");
            String ch = scan.next();

            while (!(ch.equalsIgnoreCase("-")
                    || ch.equalsIgnoreCase("+")
                    || ch.equalsIgnoreCase("/") || ch.equalsIgnoreCase("*"))) {
                System.out.println("invalid math operator,re enter");
                System.out.println("Enter valid math operator ");
                String ch1 = scan.next();
            }
            System.out.println("Enter second number");
            int number2 = scan.nextInt();

            System.out.println(number + number2);
            System.out.println("Do you want to continue? yes/no");
            String answer = scan.next().toLowerCase();
            while (!(answer.equalsIgnoreCase("yes")
                    || answer.equalsIgnoreCase("No"))) {
                System.out.println("invalid answer. re enter");
                String answer1 = scan.next().toLowerCase();
            }

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }else{
                scan.nextLine();
                continue;

            }

            //System.out.println("invalid number,re enter");
        }
    }
}
