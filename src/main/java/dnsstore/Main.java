package dnsstore;

import dnsstore.item.*;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    static List<Item> items = List.of(
            //телефоны
            new Phone("Samsung a 35", 30_000, 2020),
            new Phone("Xiaomi z777", 60_000, 2021),
            new Phone("Iphone 14", 130_000, 2022),

            //ноутбуки
            new Laptop("HP", 35_000, 2020),
            new Laptop("Lenovo ", 55_000, 2021),
            new Laptop("MacBook pro 15 ", 155_000, 2021),

            //телевизоры
            new TV("Samsung", 40_000, 2020),
            new TV("Samsung", 40_000, 2020),
            new TV("Samsung", 40_000, 2020),

            //наушники
            new Headphones("JBL", 5_000, 2021),
            new Headphones("JBL", 5_000, 2021),
            new Headphones("JBL", 5_000, 2021)
    );




    // TODO: 18.10.2022
//     items.stream().filter(e -> e instanceof Phone).toList()
//    Есть вариант отфильтровать стримами
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    showItemInfo(items);

        List<Item>  stream = items.stream()
                        .filter(e -> e instanceof Phone)
                        .collect(Collectors.toList());
        System.out.println(stream);

    }

//     items.stream().filter(e -> e instanceof Phone).toList() отфильровать по объектам


    public static void showItemInfo (List < Item > items) {
        for (Item item : items) {
            item.showInfo(); //D- принцип инверсии зависимостей(Dependency Inversion Principle)
        }

    }
}

