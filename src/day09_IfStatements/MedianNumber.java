package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
   int a=10,
     b=20,
     c= 30;
   /*if we have 3 different numbers one Must be max one Must be min and the other one Must be median

    */
     boolean aIsMedian= (a>b && a<c) ||(a>c &&a<b);
         //if(a<b&&a>c)
        /*in order a to be median number:
        1.is c is the max number&b is the min number
        2 if b is max num & c is the min numb
         */
     boolean bIsMedian =(b>c && b<a) ||(b>a && b<c);
     boolean cIsMedian = !aIsMedian &&!bIsMedian;
      if(aIsMedian){
          System.out.println(a+"is median number");
      }
     if(bIsMedian){
         System.out.println(b+ " is median number");
     }
     if(cIsMedian) {
         System.out.println(c+ "is median number");
     }
    }


}
/*Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */