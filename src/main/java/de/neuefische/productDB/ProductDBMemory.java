package de.neuefische.productDB;

import java.util.ArrayList;
import java.util.Optional;

public class ProductDBMemory implements ProductDB{


    @Override
    public Optional<ArrayList<Product>> listProducts() {
        return Optional.empty();
    }
}
