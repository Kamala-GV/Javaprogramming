package day28_ArrayList;

import java.util.ArrayList;

public class Hometasks_Day28 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.set(numbers.size() - 1, 0);
        System.out.println(numbers);


// Write a program that can find the maximum number from an ArrayList of integers
//		Ex:
//			list = [1,2,3,4,5];
//			output:
//				5
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        int max = number.get(0);
        for (int each : number) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println(max);


        System.out.println("============================");

        ArrayList<Integer> num = new ArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        int min = num.get(0);
        for (int each : num) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println(min);


        System.out.println("==================================");

        //Remove Duplicates


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer each : list) {
            if (result.contains(each)) {
                continue;
            } else {
                result.add(each);
            }


        }
        System.out.println(result);


        System.out.println("===========================");

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("a");
        listOne.add("b");
        listOne.add("c");
        listOne.add("d");
        listOne.add("e");

        ArrayList<String> listTwo = new ArrayList<>();
        listTwo.add("f");
        listTwo.add("g");
        listTwo.add("h");

        listOne.addAll(listTwo);    //Merge both lists

        System.out.println(listOne);

        System.out.println("====================================");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(5);
        list1.add(1);
        list1.add(3);
        list1.add(8);
        for (int i = 0; i < list1.size(); i++) {
            if(i%2!=0)
            list1.set(i, list1.get(i) * 2);
        }


        System.out.println(list1);
    }
    }



///1. write a program that can set the last element of the Integer arraylist to zero
//	            ex:
//	                list = [1,2,3,4,5];
//	                output: [1,2,3,4,0];
//