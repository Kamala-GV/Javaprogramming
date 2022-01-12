package day24CustomMethodsReturn;

public class MinMuberFromArray {
    public static void main(String[] args) {
        int[] num = {7, 8, 5,4,2};
        System.out.println(min(num));

    }

    public static int min(int num[]) {
        int min = num[0];

        for (int each : num) {
            if (each<min) {
                 min=each;


            }
        }
        return min;
    }
    }

