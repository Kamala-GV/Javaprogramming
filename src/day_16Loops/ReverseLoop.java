package day_16Loops;

public class ReverseLoop {
    public static void main(String[] args) {
        String str=" Rustam Guliev";
        String result="";

        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        System.out.println(result);
    }
}