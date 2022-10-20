package dnsstore.item;

public class TV extends Item {


    public TV(String itemName, int price, int year) {
        super(itemName, price, year);
    }

    public TV(String itemName) {
        super(itemName);
    }

    @Override
    public void character(String name, int memory, int price) {

    }
}
