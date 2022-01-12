package myPractices;

public class FrequencyofArray {

    public static int unique(int[] array,int element){
        int count=0;
        for (int each: array) {
            if(each==element){
                count++;
            }

        }
        return count;
    }
}
