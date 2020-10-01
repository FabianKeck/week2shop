package de.neuefische.productDB;

public class Product {
    private String name;
    private String id;
    private int prize;

    public Product(String name, String id) {
        this.name = name;
        this.id = id;
        this.prize = prize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
}
