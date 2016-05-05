package com.kapx.spring.product.controller;

import com.kapx.spring.product.domain.Product;
import com.kapx.spring.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    public List<Product> getProducts() {
        return productService.listProducts();
    }
}
