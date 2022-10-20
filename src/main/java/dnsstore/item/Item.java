package dnsstore.item;

public abstract class Item implements Сharacteristics {

    private String itemName;
    int id;
    private int price;
    private int year;

    private static int nextId = 1;

    public Item(String itemName, int price, int year) {
        this.itemName = itemName;
        this.price = price;
        this.year = year;
        this.id = nextId++;
    }


    public Item(String itemName) {
        this.itemName = itemName;
    }


    public void showInfo() {
        System.out.println(
                        id + ")"
                        + "[ " + itemName + " ]"
                        + "\nцена " + price + " руб."
                        + "\nгод выпуска: " + year + "\n");
    }


    public String toString() {
        return itemName;
    }
}

