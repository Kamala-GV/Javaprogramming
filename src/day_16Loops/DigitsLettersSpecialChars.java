package day_16Loops;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str= "Cydeo1234School$%#@";
        String result="";
        String digits="";
        String letters="";
        String SpecialChars="";
        for(int i=0; i< str.length(); i++){
            char ch=str.charAt(i);
            if(ch>='0'&& ch<='9'){
                digits+=ch;
            }else if(ch>='A'&& ch<='Z'){
                letters+=ch;

            }else if(ch>='a'&& ch<='z'){
                letters+=ch;
            }else{
                SpecialChars+=ch;
            }
        }

        System.out.println(digits);
        System.out.println(letters);
        System.out.println(SpecialChars);
    }
}
