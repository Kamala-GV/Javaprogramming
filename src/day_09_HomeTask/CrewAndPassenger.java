package day_09_HomeTask;

import java.sql.SQLOutput;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int total= 50;
        String result="";

        if(total>=50 && total<=100){

            if(total==50){
                result="20 crew, 30 passengers";
            }else if(total==75){
                result="25 crew,50 passengers";
            }else{
                result="30 crew, 70 passengers";
            }

        } else{
                result= "Not valid";

            }
        System.out.println(result);




    }
}
