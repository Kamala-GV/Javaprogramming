package day28_ArrayList;

public class Assignments {
    public static void main(String[] args) {


        int a = 0;
        do {
            a = a++ + --a - (a % 3);
        } while (++a < 4);
        System.out.println(a);

    }


}
