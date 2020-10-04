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
                new WeighableProduct("Stuhl", "2"),
                new WeighableProduct("Tisch", "1")
                ));
        ProductDB productDB =new ProductDBMemory(products);
        //when
        Optional<ArrayList<Product>> actual=productDB.list();
        //then
        assertTrue(actual.isPresent());
        assertArrayEquals(actual.get().toArray(),new WeighableProduct[] {
                new WeighableProduct("Tisch", "1"),new WeighableProduct("Stuhl", "2")
        });

    }

    @Test
    void getByIdTestPositive(){
        //given
        ArrayList<Product> products = new ArrayList<>(List.of(
                new WeighableProduct("Tisch", "1"),
                new WeighableProduct("Stuhl", "2")
        ));
        WeighableProduct expected =new WeighableProduct("Tisch","2");
        ProductDB productDB =new ProductDBMemory(products);
        //when
        Optional<Product> actual = productDB.getById("2");
        //
        if(actual.isPresent()){
            assertEquals(expected,actual.get());
        } else{
            fail("getByIDTestPositive: No Student returned");
        }

    }

    @Test
    void getByIdTestNegative(){
        //given
        ArrayList<Product> products = new ArrayList<>(List.of(
                new WeighableProduct("Tisch", "1"),
                new WeighableProduct("Stuhl", "2")
        ));
        Product expected =new WeighableProduct("Tisch","2");
        ProductDB productDB =new ProductDBMemory(products);
        //when
        Optional<Product> actual= productDB.getById("3");
        assertTrue(actual.isEmpty());

    }




}