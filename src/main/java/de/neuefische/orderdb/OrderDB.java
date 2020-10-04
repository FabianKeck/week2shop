package de.neuefische.orderdb;

import java.util.ArrayList;
import java.util.Optional;

public interface OrderDB {
    void add(Order order);
    Optional<Order> getByID(String id);

    ArrayList<Order> list();
}
