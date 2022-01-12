package day24CustomMethodsReturn;

public class Hometask4 {
    public static void main(String[] args) {
       String s1= removeDuplicate("AAABBBFF");
        System.out.println(s1
        );


    }

    public static String removeDuplicate(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);

            if (!result.contains(ch)) {
                result += ch;

            }
        }
        return result;
    }
}
