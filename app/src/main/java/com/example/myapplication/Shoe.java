package com.example.myapplication;

public class Shoe {

    private String name;
    private String size;
    private String model;
    private String price;
    private String photo;

    public Shoe(String name, String size, String model, String price, String photo) {
        this.name = name;
        this.size = size;
        this.model = model;
        this.price = price;
        this.photo = photo;
    }

    public Shoe() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", model='" + model + '\'' +
                ", price='" + price + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }



}
