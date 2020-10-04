package de.neuefische.orderdb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class OrderDBMemory implements OrderDB{
    private ArrayList<Order> orders= new ArrayList<>();


    @Override
    public void addOrder(Order order) {

    }

    @Override
    public Optional<Order> getByID(String id) {
        return Optional.empty();
    }


    @Override
    public ArrayList<Order> listOrders() {
        return null;
    }
}
