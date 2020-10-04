package de.neuefische.orderdb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Optional;

public class OrderDBMemory implements OrderDB{
    private HashMap<String, Order> orders= new HashMap<>();


    @Override
    public void add(Order order) {
        orders.put(order.getId(),order);
    }

    @Override
    public Optional<Order> getByID(String id) {
        Order outOrder=orders.get(id);
        return outOrder== null ? Optional.empty() : Optional.of(outOrder);
    }


    @Override
    public ArrayList<Order> list() {
        ArrayList<Order> orderArrayList= new ArrayList<>();
        orders.forEach(
                (id,order)->orderArrayList.add(order)
                );
        orderArrayList.sort(Comparator.comparing(Order::getId));
        return orderArrayList;
    }
}
