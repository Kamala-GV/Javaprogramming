package day30_CustomClass;

import java.util.ArrayList;

import java.util.Arrays;
public class DogObjects {
    public static void main(String[] args) {


        Dog dog1 = new Dog();



        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";
        System.out.println(dog1);

        Dog dog2 = new Dog();

        dog2.name = "ACE" ;
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";


        Dog dog3 = new Dog();
         dog3.setInfo("Cody","Maltese",3,'M',
                 "large","black");
        Dog dog4= new Dog();
        dog4.setInfo("Chelsie","german shepherd",2,'M',
                "large","gray");

        Dog dog5 = new Dog();
        dog5.setInfo("Amaro","bulldog",1,'F',
                "small","white");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);

        dog1.eat();
        dog2.bark();





        System.out.println("=============================================");

        //Dog[] dogs={dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog>femaleDogs=new ArrayList();
        ArrayList<Dog>maleDogs=new ArrayList();
        ArrayList<Dog>dogs=new ArrayList<>();
        dogs.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
        for (Dog dog : dogs) {
            if(dog.gender=='F') {
                femaleDogs.add(dog);

            }else{
                   maleDogs.add(dog);
                }
        }
        System.out.println(femaleDogs);
        System.out.println(maleDogs);


      /*  ArrayList<Dog>femaleDogs=new ArrayList(Arrays.asList(dogs));
        ArrayList<Dog>maleDogs=new ArrayList(Arrays.asList(dogs));

        maleDogs.removeIf(p-> p.gender=='F');

        femaleDogs.removeIf(p-> p.gender=='M');

        System.out.println(maleDogs);
        System.out.println(femaleDogs);*/


    }
    }



