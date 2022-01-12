package day_09_HomeTask;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        String result = "";
        if (grade >= 'A' && grade <= 'F'){

            if (grade == 'A') {
                result ="Excellent";
            } else if (grade == 'B') {
                result = "Great job";
            } else if (grade == 'C') {
                result = " Good";
            } else if (grade =='D') {
                result = "Passed";

            } else {
                result = "Failed";
            }
        }else{
            result="Invalid grade";
        }
        System.out.println(result);



    }
}