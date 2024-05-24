package com.ferneymanco.checkout_service.service;

import com.ferneymanco.checkout_service.dto.Product;

public interface IProductService {
    public Product getProduct(String id);
}
