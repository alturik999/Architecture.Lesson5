package org.example.Models;

// абстрактный класс Продукт

public abstract class Product {
    private static int id = 0;
    private String name;          // Наименование продукта
    private String description;   // Описание продукта
    private int price;            // Цена продукта

    // Конструктор

    public Product(String name, String description, int price) {
        this.id++;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }

    public int getId(){
        return id;
    }
}