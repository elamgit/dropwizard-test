package com.riis.api;

/**
 * Created by eannamal on 2/11/17.
 */
public class Order {

    private String item;
    private int price;

    public Order(String item, int price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
