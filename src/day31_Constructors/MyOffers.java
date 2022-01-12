package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

      Offer offer1 = new Offer();
       offer1.setInfo("Virginia", "Amazon","SDET",95000,true,true,true,true);
        Offer offer2 = new Offer();
        offer2.setInfo("NY","BOA","QA",120000,true, false,true,false);

        Offer offer3= new Offer();
        offer3.setInfo("Ca","Sony","Manager",110000,true,true,true,true);

        Offer offer4 = new Offer();
        offer4.setInfo("Fl","Apple","BA",115000,false,true,false,false);

        Offer offer5 = new Offer();
              offer5.setInfo("Texas","Chase Morgan","SM",120000,true, true, true,true);



       System.out.println(offer1);
        System.out.println(offer2);


        Offer[] myOffers={offer1,offer2,offer3,offer4,offer5};


        ArrayList<Offer> fullTimeOffer=new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffer.removeIf(p-> !p.isFullTime);// removes the object that is NOT fulltime
        System.out.println(fullTimeOffer.size());


        ArrayList<Offer> localOffers=new ArrayList<>(Arrays.asList(myOffers));
        localOffers.removeIf(p-> !p.location.equals("Virginia")||p.location.equals("Ca"));//removes the offer that are NOT from local area&
        System.out.println(localOffers.size());


     for (Offer localOffer : localOffers) {
      System.out.println(localOffer.companyName+ ":"+ localOffer.salary);

     }

    }
}
