package dnsstore.item;

public class Laptop extends Item {


    public Laptop(String itemName, int price, int year) {
        super(itemName, price, year);
    }

    public Laptop(String itemName) {
        super(itemName);
    }

    @Override
    public void character(String name, int memory, int price) {

    }
}
