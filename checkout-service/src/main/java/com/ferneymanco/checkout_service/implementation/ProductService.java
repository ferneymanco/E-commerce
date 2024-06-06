package com.ferneymanco.checkout_service.implementation;

import com.ferneymanco.checkout_service.dto.Product;
import com.ferneymanco.checkout_service.repository.IProductRepository;
import com.ferneymanco.checkout_service.service.IProductService;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class ProductService implements IProductService {

    Logger log = LoggerFactory.getLogger(ProductService.class);

    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }

    @Override
    @CircuitBreaker(name="product", fallbackMethod = "getProductFallBackMethod")
    public Product getProduct(String id) {
        return productRepository.getProductById(id);
    }

    public Product getProductFallBackMethod(String id, CallNotPermittedException exception){
        return new Product();
    }


}
