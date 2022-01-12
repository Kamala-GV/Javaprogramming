package day_09_HomeTask;

public class OxigenTank {
    public static void main(String[] args) {
        int tankLevel = 85;

      String result=(tankLevel>90)? "Your tank isfull"
              :(tankLevel>80)? "Still okay" :(tankLevel>70)?
              "Don't go too far" :( tankLevel >60)? "Start to head back"
              : "Be careful now you at at 50%";
        System.out.println(result);
      }







    }

