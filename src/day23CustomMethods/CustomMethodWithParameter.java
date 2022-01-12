package day23CustomMethods;

public class CustomMethodWithParameter {
    public static void main(String[] args) {
        evenOrOdd(20);
        ageOfPerson(1988);
        printNumbers(100,150);
    }

    public static void evenOrOdd(int number){
        if(number%2==0){
            System.out.println(number+" is even");
        }else
            System.out.println(number+"is odd");
    }


    public static void ageOfPerson(int birthYear){
     int age=2021-birthYear;
        System.out.println("your age is "+age);
    }

    public static void printNumbers(int x,int y){
        for(int i=x; i<=y;i++){
            System.out.println(i);
        }
    }

}
