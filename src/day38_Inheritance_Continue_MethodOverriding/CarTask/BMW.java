package day38_Inheritance_Continue_MethodOverriding.CarTask;

public class BMW extends Cars {
    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breaksDown() {
        System.out.println(brand + " " + model + "is breaking down");

    }


    public void racing() {
        System.out.println(brand + " " + model + "is a racing car ");
    }
}
