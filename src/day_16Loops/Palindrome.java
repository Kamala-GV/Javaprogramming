package day_16Loops;

public class Palindrome {
    public static void main(String[] args) {
        String str= "annA";
        String result="";
        for(int i= str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        boolean isPalindrome=str.equalsIgnoreCase(result);

        System.out.println(isPalindrome);
    }
}
