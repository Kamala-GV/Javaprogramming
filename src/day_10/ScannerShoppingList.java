package day_10;
import java.util.Scanner;
public class ScannerShoppingList {
    public static void main(String[] args) {

         String item1 ="Tomatoes";
        String item2 ="Cheese";
        String item3 = "Apples";


        //Declare 4 double variables: price1, price2, price3, totalPrice
        double price1 = 5.5;
        double price2 = 3.5;
        double price3 = 6.3;
        double totalPrice = price1 + price2+ price3;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        item1 = scan.next();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        item2 = scan.next();
        price2 = scan.nextDouble();



        System.out.println("Enter Item3 and its price:");
        item3 = scan.next();
        price3 = scan.nextDouble();




        System.out.println("Item1: " + item1 + " Price: " + price1 + ", " +"Item2: " + item2 + " Price: " + price2 + ", " + "Item3: " + item3 + " Price: " + price3 + "\n" + "Total price: " + totalPrice);


    }
}






