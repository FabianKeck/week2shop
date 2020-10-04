package de.neuefische.orderdb;

import java.util.ArrayList;

public interface OrderDB {
    void addOrder(Order order);
    ArrayList<Order> listOrders();

}
