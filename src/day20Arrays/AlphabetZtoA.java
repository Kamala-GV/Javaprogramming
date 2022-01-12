package day20Arrays;

import java.util.Arrays;

public class AlphabetZtoA {
    public static void main(String[] args) {
        char[]alphabet=new char[26];
        char ch='Z';
        for(char i =0; i<alphabet.length;i++, ch--){
        alphabet [i]=ch;
        }
        System.out.println(Arrays.toString(alphabet));


        /*
        for(char i = 0, j = 'Z';  i < alphabets.length; i++, j-- ){
            alphabets[i] = j;
        }
*/


    }
}
