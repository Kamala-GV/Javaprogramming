package day20Arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Gunay";
        names[1] = "Neira";
        names[2] = "Suat";
        names[4] = "Hulya";
        names[3] = "Mikael";
        System.out.println(Arrays.toString(names));

        //if you know the index but we dont know the elements we use new above
        String[] days = {"Moday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));
        System.out.println(days[5]);

        int num = 12;
        if (num < 1 || num > 7) {
            System.err.println("Invalid number");
            System.exit(0);


        }

    }
}

