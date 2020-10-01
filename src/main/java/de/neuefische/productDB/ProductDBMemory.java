package de.neuefische.productDB;

import java.util.ArrayList;
import java.util.Optional;

public class ProductDBMemory implements ProductDB{





    @Override
    public Optional<ArrayList<Product>> list() {
        return Optional.empty();
    }

    @Override
    public Optional<Product> getById() {
        return Optional.empty();
    }
}
