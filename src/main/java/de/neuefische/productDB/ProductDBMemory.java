package de.neuefische.productDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

public class ProductDBMemory implements ProductDB{
    private HashMap<String , Product> products;

    ProductDBMemory(ArrayList<Product>productArray){
        products= new HashMap<>();
        productArray.forEach(product-> products.put(product.getId(),product));
    }


    @Override
    public Optional<ArrayList<Product>> list() {

        return Optional.empty();
    }

    @Override
    public Optional<Product> getById(String id) {
        return Optional.empty();
    }
}
