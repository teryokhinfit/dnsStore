package dnsstore.item;

public class Phone extends Item {

    public Phone(String itemName, int price, int year) {
        super(itemName, price, year);
    }

    public Phone(String itemName) {
        super(itemName);
    }

    @Override
    public void character(String name, int memory, int price) {

    }


}
