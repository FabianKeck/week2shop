package de.neuefische.productDB;

import java.util.Objects;

public class WeighableProduct implements Product{
    private String name;
    private String id;
    private int prize;

    public WeighableProduct(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeighableProduct that = (WeighableProduct) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
