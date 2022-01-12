package day23CustomMethods;

public class CustomMethodsHometasks {
    public static void main(String[] args) {
        evenNumbers();
        eligibleToVote(17,"USA");
    }
    /*1. create a method that can print
    odd numbers between 1~100 in a
    same line saperated by space

	2. create a method that
	 can print even numbers
	  between 1~100 in a same line
	  saperated by space
*/


    public static void evenNumbers() {

        for (int i = 1; i < 101; i += 2) {
            System.out.print(i + " ");
        }
    }


    public static void eligibleToVote(int age, String citizenship) {
        if (age >= 18 && citizenship.equals("USA")) {
            System.out.println("eligible");
        } else {
            System.out.println("Ineligible to vote");
        }
    }
}

