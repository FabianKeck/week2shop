package de.neuefische.orderdb;

import de.neuefische.productDB.Product;

import java.util.ArrayList;

public class Order {
    String id;
    ArrayList<Product> products;

    public Order(String id, ArrayList<Product> products) {
        this.id = id;
        this.products = products;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }



}
