package de.neuefische.orderservice;

import de.neuefische.orderdb.Order;
import de.neuefische.productDB.Product;
import de.neuefische.productDB.ProductDB;
import de.neuefische.productDB.ProductDBMemory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    @Test
    void testAddOrdersMissingProduct(){
        //given
        OrderService orderService = new OrderService(new ArrayList<>(List.of(
                new Product("Fisch","1"),
                new Product("Fleisch", "2")
        )));
        Order newOrder= new Order(new ArrayList<>(List.of(
                        new Product("Fleisch", "3")
        )),"2");
        //when

        try {
            orderService.addOrder(newOrder);
            fail("Add Order did not throw an exception after non existing item was ordered.");
        } catch (RuntimeException e){
            //then
            assertEquals("OrderService.addOrder: No such product available.", e.getMessage());
        }
    }

    @Test
    void testAddOrdersExistingProductAndList(){
        //given
        OrderService orderService = new OrderService(new ArrayList<>(List.of(
                new Product("Fisch","1"),
                new Product("Fleisch", "2")
        )));
        Order newOrder= new Order(new ArrayList<>(List.of(
                new Product("Fleisch", "2")
        )),"1");
        ArrayList<Order> expected = new ArrayList<>();
        expected.add(new Order(new ArrayList<>(List.of(
                new Product("Fleisch", "2")
        )),"1"));
        //when
        try {
            orderService.addOrder(newOrder);
        } catch (RuntimeException e){
            fail("Order should have been added but got:" +e.getMessage());
        }
        ArrayList<Order> actual= orderService.listOrders();

        //then
        assertArrayEquals(expected.toArray(),actual.toArray());


    }

}