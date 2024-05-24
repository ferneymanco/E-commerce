package com.ferneymanco.checkout_service.dto;


public class Product {
    private String productId;
    private Double price;
    private String name;
    private String category;
    private String serviceInstance;

    public Product(String productId) {
        this.productId = productId;
    }

    public Product() {
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
