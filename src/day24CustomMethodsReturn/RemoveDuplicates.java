package day24CustomMethodsReturn;

public class RemoveDuplicates {
    public static void main(String[] args) {
          String str="AAAAGGHHH";
          String result="";

          for(int i =0; i<str.length(); i++){
             String s1=""+str.charAt(i);
             if(!result.contains(s1)){
                 result+=s1;



             }
          }
        System.out.println(result);
    }
}
