package com.jdriven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    /**
     * Create a new Product Object and persist it to the Database.
     *
     * @param title title
     * @param description description
     * @param price price
     * @param keywords keywords
     * @return Product Entity
     */
    public Product createProduct(String title, String description, Double price, String keywords) {
        
        return productRepository.save(new Product(title, description, price, keywords));
    }

    /**
     * Calculate the number of Products in the Database.
     *
     * @return the total.
     */
    public long total() {
        return productRepository.count();
    }
}

