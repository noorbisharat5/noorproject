package com.example.myapplication;

public class bisharatshoes {
    private String name;
    private String size;
    private String model;
    private String address;

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public String getModel() {
        return model;
    }

    public String getAddress() {
        return address;
    }

    public bisharatshoes(String name, String size, String model, String address) {
        this.name = name;
        this.size = size;
        this.model = model;
        this.address = address;
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
        this.address = address;
    }

    @Override
    public String toString() {
        return "com.example.myapplication.bisharatshoes{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", model='" + model + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
