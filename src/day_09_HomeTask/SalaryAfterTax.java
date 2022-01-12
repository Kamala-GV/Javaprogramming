package day_09_HomeTask;

public class SalaryAfterTax {
    public static void main(String[] args) {

        int salary = 80000;
        boolean married =true;


        if (salary >= 130000) {
            System.out.println(salary -salary *35/100);
        } else if (salary >= 100000) {
            System.out.println(salary -salary*30/100);
        } else if ( salary>= 80000){
            System.out.println(salary -salary *25/100  );
        } else if (salary>=79000){
            System.out.println(salary-salary*20/100);
        }else{
            System.out.println("Invalid result");
        }

    }

}


/*Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition, if the person is married, he/she will pay 5% less tax*/