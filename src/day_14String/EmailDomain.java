package day_14String;


public class EmailDomain {
    public static void main(String[] args) {
        String email="kami.guliyeva@gmail.com";
     int begIndex= email.indexOf("@") +1;
     int endIndex= email.lastIndexOf(".");
     String domain=email.substring(begIndex, endIndex);
        System.out.println(domain);

        System.out.println("...................");


        String email1="kamala_guliyeva@yahoo.com";
        int firstIndex=email1.indexOf("@")+1;
        int lastIndex = email1.lastIndexOf(".");

        String domain2= email1.substring(firstIndex, lastIndex);
        System.out.println(domain2);


        String email3="kami_guliyeva@yahoo.com";

        int begIndex1= email.indexOf("@") +1;
        int endIndex1= email.lastIndexOf(".");
        String domain3 = email.substring(begIndex1,endIndex1);
        System.out.println(domain3);



    }
}
