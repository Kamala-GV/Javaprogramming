package day24CustomMethodsReturn;

public class Hometask3 {
    public static void main(String[] args) {

         String result=reverse("Java");
        System.out.println(result);
        boolean s1=isPalindrome("level");

        System.out.println(s1);

    }
    public static String reverse(String word){
        String result="";
        for(int i =word.length()-1;i>=0;i--){
            result+=word.charAt(i);
        }
       return result;
    }

    public static boolean isPalindrome(String str){
        String reversed =reverse(str);
        return reversed.equalsIgnoreCase(str);

    }

}
