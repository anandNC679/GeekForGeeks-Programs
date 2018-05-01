package com.MapExamples;

import java.util.Objects;

/**
 * author anand.
 * since on 21/4/18.
 */

class Price{
    String item;
    private int price;

    public Price(String item, int price) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price1 = (Price) o;
        return price == price1.price &&
                Objects.equals(item, price1.item);
    }

    @Override
    public int hashCode() {

        System.out.println("In hashCode");
        int hashValue=price*20;
        hashValue+=item.hashCode();
        return hashValue;
    }
}
public class MyDeleteKeyObject {
}
