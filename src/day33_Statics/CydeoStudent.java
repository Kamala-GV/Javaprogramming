package day33_Statics;

public class CydeoStudent {

    public String name;
    public  int  age;
    public char gender;
    public int ID;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public static String programmingLanguage;

    public CydeoStudent(String name, int age, char gender, int ID, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        
    }


    public void study(){
        System.out.println(name +"is studying");

    }
    public static void printSchoolName(){
        System.out.println("CydeoSchool");
    }

    public static void printProgrammingLanguage(){
        System.out.println("Java");

    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
