package de.neuefische.orderdb;

import de.neuefische.productDB.Product;

import java.util.ArrayList;
import java.util.Objects;

public class Order {
    private String id;
    private ArrayList<Product> products;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(products, order.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, products);
    }
}
