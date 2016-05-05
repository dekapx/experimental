package com.kapx.spring.product.repository;

import com.kapx.spring.product.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("productDao")
public class ProductDaoImpl implements ProductDao {
    @Override
    public List<Product> listProducts() {
        final List<Product> products = new ArrayList<Product>(2);
        products.add(new Product("MacBook Pro"));
        products.add(new Product("iPhone 6s"));
        return products;
    }
}
