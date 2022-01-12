package day_15;

public class Loop_FinRa {
    public static void main(String[] args) {


        for (int i = 1; i <= 100;i++ ){
            if(i%15==0){
                System.out.println("Finra");
            }else if(i%3==0){
                System.out.println("Fin");
            }else if(i%5==0){
                System.out.println("Ra");
            }else{
                System.out.println(i+"");
            }
        }




    }
}