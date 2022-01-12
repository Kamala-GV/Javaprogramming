package day33_Statics;

public class CydeoStudentObject {
    public static void main(String[] args) {
        CydeoStudent student1=new CydeoStudent("Kamala",37,'F',2324,'A',25,10);
        System.out.println(student1);
        CydeoStudent student2=new CydeoStudent("Leyla",38,'F',4565,'A',25,3446);
        System.out.println(student2);

        CydeoStudent.printSchoolName();
        CydeoStudent.printProgrammingLanguage();














    }
}
