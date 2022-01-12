package day21ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Java";
        char[] chars=str.toCharArray();

        System.out.println(Arrays.
                toString(chars));
        for (char each : str.toCharArray()) {
            System.out.println(each);
        }

        System.out.println("--------------");
        String str3="Wooden Spoon";
        String[] words=str3.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("----------");


        String email="kami.guliyeva@yahoo.com";
        String[]arr=email.split("@");
        System.out.println(Arrays.toString(arr
        ));

    }
}
