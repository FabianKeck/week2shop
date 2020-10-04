package de.neuefische.orderdb;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderDBMemory implements OrderDB{
    ArrayList<Order> orders= new ArrayList<>();

    @Override
    public void addOrder(Order order) {

    }

    @Override
    public ArrayList<Order> listOrders() {
        return null;
    }
}
