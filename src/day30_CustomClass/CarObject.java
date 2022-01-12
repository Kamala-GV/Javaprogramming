package day30_CustomClass;


import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {
    public static <Arraylist> void main(String[] args) {
        Car car1=new Car();

        car1.setInfo("Toyota","Camry", "blue",2007,50000);

        System.out.println(car1);



        Car car2=new Car();
        car2.setInfo("BMW","X5","White",2010,60000);

        System.out.println(car2);



        Car car3=new Car();
        car3.setInfo("Audi","Q7","White",2011,55000);
        System.out.println(car3);


        ArrayList<Car> carsList =new ArrayList();

        carsList.addAll(Arrays.asList(car1,car2,car3));

        for(Car each:carsList){

            System.out.println(each.brand+ ":" + each.price);
        }


        //Recall: Toyota-1995-1997
        //BMw-2001=2008
        carsList.removeIf(p-> p.brand.equals("BMW")&& p.year>=2000&&p.year<=2011);
        carsList.removeIf(p-> p.brand.equals("Toyota")&& p.year>=2001 &&p.year<=2010);





    }

}
