package tasks;

public class Gift {

    private float price;
    private char size;
    private String material;
    private boolean forChildren;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isForChildren() {
        return forChildren;
    }

    public void setForChildren(boolean forChildren) {
        this.forChildren = forChildren;
    }

    public void gifting(String name, String message){
        System.out.println("Gift for " + name);
        System.out.println("Message" + message);
        System.out.println("\t Price " + price);
        System.out.println("\t Size " + size);
        System.out.println("\t Material " + material);
        if(forChildren){
            System.out.println("\t You have been a good kid this year");
        }else{
            System.out.println("\t Please give this to your parents");
        }
    }
}
