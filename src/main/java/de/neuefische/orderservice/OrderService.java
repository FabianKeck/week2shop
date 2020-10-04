package de.neuefische.orderservice;

import de.neuefische.orderdb.OrderDB;
import de.neuefische.orderdb.OrderDBMemory;
import de.neuefische.productDB.Product;
import de.neuefische.productDB.ProductDB;
import de.neuefische.productDB.ProductDBMemory;

import java.util.ArrayList;

public class OrderService {
    private ProductDB productDB;
    private OrderDB orderDB = new OrderDBMemory();

    public OrderService(ArrayList<Product> products){
        productDB= new ProductDBMemory(products);
    }
}
