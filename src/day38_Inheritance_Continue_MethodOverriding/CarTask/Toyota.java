package day38_Inheritance_Continue_MethodOverriding.CarTask;

public class Toyota extends Cars {
    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }


    public void reliable(){
        System.out.println(brand +" "+ model +"is reliable");
    }


}
