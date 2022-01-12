package day11;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter age");

        int age= input.nextInt();
        input.nextLine();
        System.out.println("Fullname");
        String fullName= input.nextLine();

        System.out.println("GPA");
        double gpa =input.nextDouble();
        input.nextLine();
        System.out.println("SchoolName");
        String schoolName=input.nextLine();

        System.out.println("age=" +age);
        System.out.println("fullname="+fullName);
        System.out.println("Gpa="+ gpa);
        System.out.println("School name="+ schoolName);
    }
}
