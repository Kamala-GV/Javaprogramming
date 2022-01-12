package muhtarsTasks;

import java.util.Scanner;

public class JavaJava {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s = scan.nextLine();
        int result=0;
        for (int i = 0; i <s.length() ; i++) {
            if (s.contains("Java")){
                s=s.replaceFirst("Java","");
                result ++;
            }

        }

        System.out.println(result);

    }
}
