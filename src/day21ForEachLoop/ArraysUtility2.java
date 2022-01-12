package day21ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {
    public static void main(String[] args) {
        String[] students={"Kamala","Gunay","Elif","Aaron"};
        String[] earlybirds=Arrays.copyOf(students,3);
        System.out.println(Arrays.toString(earlybirds));

        int[] numbers={1,2,3,4,5,};
        numbers=Arrays.copyOf(numbers,4);
        System.out.println(Arrays.toString(numbers));

        System.out.println("------------");
        char[] ch1={'A','B','C','D','T','O','S'};
        char[]  ch2=Arrays.copyOfRange(ch1,2,6
        );
        System.out.println(Arrays.toString(ch2));




    }
}
