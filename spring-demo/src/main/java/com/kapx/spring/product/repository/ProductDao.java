package com.kapx.spring.product.repository;

import com.kapx.spring.product.domain.Product;

import java.util.List;

public interface ProductDao {
    List<Product> listProducts();
}
