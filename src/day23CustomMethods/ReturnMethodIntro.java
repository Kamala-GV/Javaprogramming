package day23CustomMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {
        String str = "Java";
        String result = reverse(str);
        System.out.println(result);
        if (str.equalsIgnoreCase(result)) {
            System.out.println("palendrome");
        } else {
            System.out.println("not Palendrome");
        }
    }

             public static String reverse(String str){
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            return reverse;

        }
    }

