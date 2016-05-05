package com.kapx.spring.product.service;


import com.kapx.spring.product.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> listProducts() {
        final List<Product> products = new ArrayList<Product>(2);
        products.add(new Product("MacBook Pro"));
        products.add(new Product("iPhone 6s"));
        return products;
    }
}
