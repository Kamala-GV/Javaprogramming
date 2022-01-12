package day30_CustomClass;

import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {


        Student student1=new Student();
        student1.setInfo("Aygun",'F',39,2210,'A');

        Student student2=new Student();
        student2.setInfo("Aysun",'F',37,2110,'A');
        Student student3=new Student();
        student3.setInfo("Ali",'M',34,1210,'B');
        Student student4=new Student();
        student4.setInfo("Koray",'M',33,3410,'B');
        Student student5=new Student();

        student5.setInfo("Enes",'M',37,3710,'A');

        Student[] students={student1, student2, student3, student4,student5};

        for (Student student : students) {
            System.out.println(student);

        }

        System.out.println("=================================");


        ArrayList<Student> earlyBirds=new ArrayList();
        ArrayList<Student> angryBirds=new ArrayList();


        for (Student student : students) {
            if(student.grade=='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);


    }
}
