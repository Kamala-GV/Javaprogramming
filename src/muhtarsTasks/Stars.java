package muhtarsTasks;

public class Stars {
    public static void main(String[] args) {
        String str=" **********";
        String result="";

        for(int i=0;i<=str.length()-1;i++){
            result+=str.charAt(i);

            System.out.println(result);
        }
    }
}
