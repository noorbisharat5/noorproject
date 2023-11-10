package com.example.myapplication;

public class Shoe {
    private String name;
    private String size;
    private String model;
    private String price;

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public String getPrice() {
        return price;
    }

    public Shoe(String name, String size, String model, String address) {
        this.name = name;
        this.size = size;
        this.model = model;
        this.price = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAddress(String address) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "com.example.myapplication.bisharatshoes{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
