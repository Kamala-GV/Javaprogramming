package day23CustomMethods;

public class CustomMethodGrade {
  public static void main(String[] args) {
    gradeOfStudent(85);
    gradeOfStudent(85);
  }

  public static void gradeOfStudent(int grade){
    if(grade>=70){
      System.out.println("Passed");
    }else{
      System.out.println("failed");
    }
  }




}