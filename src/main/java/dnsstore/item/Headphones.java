package dnsstore.item;

public class Headphones extends Item {


    public Headphones(String itemName, int price, int year) {
        super(itemName, price, year);
    }

    public Headphones(String itemName) {
        super(itemName);
    }

    @Override
    public void character(String name, int memory, int price) {

    }
}
