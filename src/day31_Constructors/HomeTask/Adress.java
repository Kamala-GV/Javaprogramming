package day31_Constructors.HomeTask;

public class Adress {
    public int buildingNumber;
    public String street;
    public String city;
    public int zipCode;


    public Adress(int buildingNumber, String street, String city, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }


    public String toString() {
        return "Adress{" +
                "buildingNumber=" + buildingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
   /* Address Task:
        2.1 Create a class named Address
        Attributes:
        buildingNumber, street, city, state, zipCode;

        Add a constructor to set all the fields

        Actions
        toString: returns the address
        EX:
        7925 Jones Branch Dr
        McLean Va, 22012*/