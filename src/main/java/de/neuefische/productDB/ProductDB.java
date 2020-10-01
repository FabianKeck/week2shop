package de.neuefische.productDB;

import java.util.ArrayList;
import java.util.Optional;

public interface ProductDB {
    Optional<ArrayList<Product>> listProducts();
}
