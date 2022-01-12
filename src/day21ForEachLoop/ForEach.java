package day21ForEachLoop;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50,60,70};
        for (int i = 0; i < numbers.length; i++) {
            int eachelement=numbers[i];
            System.out.println(eachelement);

        }

        System.out.println("-------");

        for(int each:numbers){
            System.out.println(each);
        }
    }
}
