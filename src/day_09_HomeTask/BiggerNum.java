package day_09_HomeTask;

public class BiggerNum {
    public static void main(String[] args) {
        int n1=60;
        int n2= 45;
        int n3= 70;

       String result= (n1>=70 && n1>=45)?"n1 is bigger" :(n1>=60 &&n2>=70)?
                "n2 is bigger":"n3 is bigger";
        System.out.println(result);
    }
}