package de.neuefische.productDB;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductDBMemoryTest {

    @Test
    void listTest(){
        //given
        ArrayList<Product> products = new ArrayList<>(List.of(
                new Product("Tisch", "1"),
                new Product("Stuhl", "2")
                ));
        ProductDB productDB =new ProductDBMemory(products);
        //when
        Optional<ArrayList<Product>> actual=productDB.list();
        //then
        assertArrayEquals(actual.get().toArray(),products.toArray() );

    }

    @Test
    void getByIdTest(){
        //given
        ArrayList<Product> products = new ArrayList<>(List.of(
                new Product("Tisch", "1"),
                new Product("Stuhl", "2")
        ));
        Product expected =new Product("Tisch","2");
        ProductDB productDB =new ProductDBMemory(products);
        //when
        Optional<Product> actual = getByIdTest("2");
        //then
        assertEquals(expected,actual.get());

    }



}