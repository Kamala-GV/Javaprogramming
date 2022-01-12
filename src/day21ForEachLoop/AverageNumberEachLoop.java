package day21ForEachLoop;

public class AverageNumberEachLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        double sum = 0; //+10+20+30...

        for (int each:numbers) {
            sum += each;
        }

        double averageNumber = sum / numbers.length;

        System.out.println("averageNumber = " + averageNumber);

    }
}
