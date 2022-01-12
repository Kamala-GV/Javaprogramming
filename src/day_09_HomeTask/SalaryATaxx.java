package day_09_HomeTask;

public class SalaryATaxx {
    public static void main(String[] args) {


        int salary = 75;

        Boolean married = true;


        if (salary >= 130 && married) {
            System.out.println(salary - salary * 30 / 100 + "k");
        } else if (salary >= 130 && !married) {
            System.out.println(salary - salary * 30 / 100 + "k");

        } else if (salary >= 100 && salary <= 129 && married) {
            System.out.println(salary - salary * 25 / 100 + "k");
        } else if (salary >= 100 && salary <= 129 && !married) {
            System.out.println(salary - salary * 30 / 100 + "k");
        } else if (salary >= 80 && salary <= 99 && married) {
            System.out.println(salary - salary * 20 / 100 + "k");
        } else if (salary >= 80 && salary <= 99 && !married) {
            System.out.println(salary - salary * 25 / 100 + "k");
        } else if (salary < 80 && married) {
            System.out.println(salary - salary * 15 / 100 + "k");
        } else {
            System.out.println(salary - salary * 20 / 100 + "k");
        }
    }
}


