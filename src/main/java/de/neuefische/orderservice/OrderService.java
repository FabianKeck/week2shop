package de.neuefische.orderservice;

import de.neuefische.orderdb.Order;
import de.neuefische.orderdb.OrderDB;
import de.neuefische.orderdb.OrderDBMemory;
import de.neuefische.productDB.Product;
import de.neuefische.productDB.ProductDB;
import de.neuefische.productDB.ProductDBMemory;

import java.util.ArrayList;
import java.util.ListIterator;

public class OrderService {
    private ProductDB productDB;
    private OrderDB orderDB = new OrderDBMemory();

    public OrderService(ArrayList<Product> products){
        productDB= new ProductDBMemory(products);
    }

    public void addOrder(Order newOrder){
       if (!allProductsContainedOnProductDB(newOrder)){
           throw new RuntimeException("OrderService.addOrder: No such product available.");
       }
       orderDB.add(newOrder);
    }

    public ArrayList<Order> listOrders(){
        return  orderDB.list();
    }

    private boolean allProductsContainedOnProductDB(Order order){
        ArrayList<Product> products = order.getProducts();
        for(Product product : products){
            if(productDB.getById(product.getId()).isEmpty()) return false;
        }
        return true;
    }
}
