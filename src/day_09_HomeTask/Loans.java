package day_09_HomeTask;

public class Loans {
    public static void main(String[] args) {
        int salary = 60000;
        int credit = 700;

        String result = (credit >= 650 && salary >= 60000) ? "Loan Approved"
                : "Loan Denied";


        System.out.println(result);
    }


}


