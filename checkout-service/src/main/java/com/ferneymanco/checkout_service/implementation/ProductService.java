package com.ferneymanco.checkout_service.implementation;

import com.ferneymanco.checkout_service.dto.Product;
import com.ferneymanco.checkout_service.repository.IProductRepository;
import com.ferneymanco.checkout_service.service.IProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {

    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.getProductById(id);
    }
}
