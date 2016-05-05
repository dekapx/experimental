package com.kapx.spring.product.service;


import com.kapx.spring.product.domain.Product;
import com.kapx.spring.product.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> listProducts() {
        return productDao.listProducts();
    }
}
