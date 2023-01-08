package oop;

public class CallingApartmentClass {
    public static void main(String[] args) {
        Apartment apartment1 = new Apartment(3, 5, 90.7d, "Vilnius street", true);
        apartment1.printApartmentInfo();
    }
}
