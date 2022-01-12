package day21ForEachLoop;

public class MinNumberForEachLoop {
    public static void main(String[] args) {
        int[] numbers={4,5,8,9,0};
        int min=numbers[0];
        for(int each:numbers){
            if(each<min){
                min=each;
            }
        }
        System.out.println(min);
    }
}
