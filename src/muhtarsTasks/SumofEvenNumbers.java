package muhtarsTasks;

public class SumofEvenNumbers {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <=100; i++) {
            if (i % 2 ==0) {
                sum += i;
            }
        }
        System.out.println(sum);

}
    }

