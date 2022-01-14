package day38_Inheritance_Continue_MethodOverriding.CarTask;

public class Tesla extends Cars {
    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }


    public void autoPilot() {
        System.out.println(brand + " " + model + " is in autopilot mode");
    }
}
