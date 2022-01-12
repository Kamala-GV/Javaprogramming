package day20Arrays;

import java.util.Arrays;

public class ReversedNamesAarray {
    public static void main(String[] args) {
        String[] name = {"Aysun", "Leyla ", "Aliya "};

          /*  for (int j=0;j<group.length; j++){
                String name=group[j];
                String reverse="";
             for(int i=name.length()-1;i>=0;i--){
                 reverse+=name.charAt(i);
             }
                System.out.println(reverse);*/

        for (String each : name) {
            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reversed += each.charAt(i);

            }
            System.out.println(reversed);
        }
    }
}



