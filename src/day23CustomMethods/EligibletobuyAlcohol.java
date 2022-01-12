package day23CustomMethods;

public class EligibletobuyAlcohol {
    public static void main(String[] args) {
     eligibleToBuyAlcohol(17);
    }


    public static void eligibleToBuyAlcohol(int age) {

        if (age > 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Ineligible");
        }
    }
}