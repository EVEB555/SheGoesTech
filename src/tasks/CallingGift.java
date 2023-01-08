package tasks;

public class CallingGift {
    public static void main(String[] args) {

        Gift gift1 = new Gift();

        gift1.setPrice(129.99f);
        gift1.setSize('L');
        gift1.setMaterial("Plastic");
        gift1.setForChildren(false);

        System.out.println(gift1.getPrice());

        gift1.gifting("Bob", "Marry Christmas, Bob");
    }
}
