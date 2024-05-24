package com.ferneymanco.productsservice.model;

public class Product {
    private String productId;
    private Double price;
    private String name;
    private String category;
    private String serviceInstance;

    public Product(String productId, Double price, String name, String category, String serviceInstance) {
        this.productId = productId;
        this.price = price;
        this.name = name;
        this.category = category;
        this.serviceInstance = serviceInstance;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getServiceInstance() {
        return serviceInstance;
    }

    public void setServiceInstance(String serviceInstance) {
        this.serviceInstance = serviceInstance;
    }
}
