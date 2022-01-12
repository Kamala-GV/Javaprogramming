package day24CustomMethodsReturn;

public class MaxNumFromArray {
    public static void main(String[] args) {
        int [] num={4,6,7,9,10};

            System.out.println(maxNumber(num));


    }

    public static int maxNumber(int num[]) {
        int maxNumber = num[0];
        for (int each : num) {
            if (each > maxNumber) {
                maxNumber = each;
            }

        }
           return maxNumber;
    }
}
