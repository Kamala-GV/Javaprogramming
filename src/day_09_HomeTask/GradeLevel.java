package day_09_HomeTask;

public class GradeLevel {
    public static void main(String[] args) {
        int schoolType = 6;
        String result = "";



            if (schoolType >= 1 && schoolType <= 5) {
                result = "Elementary";
            } else if (schoolType >= 6 && schoolType <= 8) {
                result = "Middle School";
            } else if (schoolType >= 9 && schoolType <= 12) {
                result = "High school";
            } else if (schoolType >= 13 && schoolType <= 16) {
                result = "College";
            } else {
                result = ("Grad School");
            }


                System.out.println(result);
            }
        }
