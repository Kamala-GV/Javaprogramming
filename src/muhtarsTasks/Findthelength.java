package muhtarsTasks;

public class Findthelength {
    public static void main(String[] args) {


        String str = "aabbcfff";
        char ch='a';
        int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (ch ==str.charAt(i)) {
                    count++;
                }


            }

        System.out.println( ch +""+ count+"");

    }
}
