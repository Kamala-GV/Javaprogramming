package customsMethodOverloading_day25;

import utilities.StringUtility;

public class Test {
    public static void main(String[] args) {
        String str="I love Java";
        StringUtility.printEachChar(str);






        String word ="Guliyeva Kamala";
        String reverse=StringUtility.reverse(word);
        System.out.println(reverse);






        String word1="Anna";
        boolean palindrome=StringUtility.isPalindrome("Anna");
        System.out.println(palindrome);


        int count=0;
        String[] names={"Anna", "civic","JAva","level"};
        for(String each:names)
        if(StringUtility.isPalindrome(each)){
            count++;
        }
        System.out.println(count);




        String srt="AAABBBCCGGG";
        String nonDup=StringUtility.removeDuplicates(srt);
        System.out.println(nonDup);


    }


    }

