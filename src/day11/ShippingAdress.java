package day11;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your full name");
        String fullName= input.nextLine();
        System.out.println("building numder");
        int buildingNum= input.nextInt();
        input.nextLine();
        System.out.println("street name");
        String streetName= input.nextLine();
        System.out.println("city name");
        String cityName= input.nextLine();
        System.out.println("state");
        String state= input.nextLine();
        System.out.println("zip code");
        int zipCode= input.nextInt();
        System.out.println("full name="+ fullName);
        System.out.println("building number="+buildingNum);
        System.out.println("city name="+ cityName);
        System.out.println("state="+state);
        System.out.println("zip code="+zipCode);
    }
}
