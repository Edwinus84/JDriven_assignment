package com.jdriven;

import jakarta.persistence.*;

/**
 * Definition of the Product entity with all of its columns
 */
@Entity
public class Product {
	
	// define the columns
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String title;

    @Column(length = 2000)
    private String description;

    @Column
    private Double price;
    
    @Column
    private String keywords;

    // Constructors
    public Product(String title, String description, Double price, String keywords) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.keywords = keywords;
    }

    protected Product() {
    }

    // getters and setters
    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    
}
