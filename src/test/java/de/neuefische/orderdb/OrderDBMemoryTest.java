package de.neuefische.orderdb;

import de.neuefische.productDB.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class OrderDBMemoryTest {

    @Test
    void getByIDPositive() {
        //given
        OrderDB orderDB = new OrderDBMemory();
        Order order1 = new Order(new ArrayList<>(List.of(
                new Product("Fisch","1")
        )),"1");
        orderDB.addOrder(order1);
        Order expected =  new Order(new ArrayList<>(List.of(
                new Product("Fisch","1")
        )),"1");

        //when
        Optional<Order> actual= orderDB.getByID("1");

        //then
        assertTrue(actual.isPresent());
        assertEquals(expected,actual.get());
    }
    @Test
    void getByIDNegative(){
        //given
        OrderDB orderDB = new OrderDBMemory();
        Order order1 = new Order(new ArrayList<>(List.of(
                new Product("Fisch","1")
        )),"1");
        orderDB.addOrder(order1);
        //when
        Optional<Order> actual= orderDB.getByID("2");
        //then
        assertTrue(actual.isEmpty());

    }

    @Test
    void listOrders() {
    }
}