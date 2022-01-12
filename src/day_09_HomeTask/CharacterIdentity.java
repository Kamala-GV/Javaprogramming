package day_09_HomeTask;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch='@';
        /* boolean isAlphabet=ch>=65 && ch<=90;
         boolean isDigit = ch>=48 && ch=<57;*/
         if(ch<=65 && ch>=90){
             System.out.println("Alphabet");
         }else if(ch<=48 && ch>=57){
            System.out.println("Digit");
        }else{
            System.out.println("Special character");
        }

    }
}
