package day01__04_12_21;

public class StringPractice {
    public static void main(String[] args) {
     /*   String str= "CYDEO";
        int lastIndex=str.length()-1;
        int lastsecondIndex=str.length()-2;


       String result= ""+str.charAt(lastsecondIndex)+str.charAt(lastIndex);

        System.out.println(result);
        System.out.println(result.repeat(3));

*/

        String str= "Cydeo";
        int lastSecondchar=str.length()-2;
        String chars=str.substring(lastSecondchar);
        System.out.println(chars.repeat(3));
    }
}
