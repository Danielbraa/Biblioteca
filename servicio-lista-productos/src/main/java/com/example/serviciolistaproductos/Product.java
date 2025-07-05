package com.example.serviciolistaproductos;

// Un DTO (Data Transfer Object) para mapear la respuesta del otro servicio
public class Product {
    private Long id;
    private String name;
    private double price;

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
