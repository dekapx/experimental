package com.kapx.spring.product.application;

import com.kapx.spring.product.controller.ProductController;
import com.kapx.spring.product.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan("com.kapx.spring.product")
public class ProductApplication {
    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(ProductApplication.class, args);
        final ProductController controller = (ProductController) ctx.getBean("productController");
        final List<Product> products = controller.getProducts();

        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(" - " + product.getDescription());
        }
    }
}
