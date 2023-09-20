package org.example.Services;

import org.example.Interfaces.IBasket;
import org.example.Models.Product;

import java.util.ArrayList;
import java.util.List;


// Репозиторий корзины

public class BasketRepository implements IBasket {
    private List<Product> addedProducts;   // список добавленных продуктов
    public BasketRepository() {
        if ((addedProducts == null))
            this.addedProducts = new ArrayList<>();
    }

    // метод добавления продукта в корзину имплементирован из интерфейса IBasket

    @Override
    public void addProductToBasket(Product product) {
        addedProducts.add(product);
    }
    public List<Product> getAddedProducts(){
        return addedProducts;
    }