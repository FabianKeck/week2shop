package de.neuefische.orderdb;

import de.neuefische.productDB.WeighableProduct;
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
                new WeighableProduct("Fisch","1")
        )),"1");
        orderDB.add(order1);
        Order expected =  new Order(new ArrayList<>(List.of(
                new WeighableProduct("Fisch","1")
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
                new WeighableProduct("Fisch","1")
        )),"1");
        orderDB.add(order1);
        //when
        Optional<Order> actual= orderDB.getByID("2");
        //then
        assertTrue(actual.isEmpty());

    }

    @Test
    void listOrders() {
        //given
        OrderDB orderDB = new OrderDBMemory();
        Order order1 = new Order(new ArrayList<>(List.of(
                new WeighableProduct("Fisch","1")
        )),"1");
        orderDB.add(order1);
        Order order2= new Order(new ArrayList<>(List.of(
                new WeighableProduct("Fleisch","2")
        )),"2");
        orderDB.add(order2);
        ArrayList<Order> expected = new ArrayList<>();
        expected.add(new Order(new ArrayList<>(List.of(
                new WeighableProduct("Fisch","1")
        )),"1"));
        expected.add(new Order(new ArrayList<>(List.of(
                new WeighableProduct("Fleisch","2")
        )),"2"));

        //when
        ArrayList<Order> actual = orderDB.list();

        //then
        assertArrayEquals(expected.toArray(),actual.toArray());



    }
}