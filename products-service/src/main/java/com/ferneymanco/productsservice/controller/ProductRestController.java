package com.ferneymanco.productsservice.controller;

import com.ferneymanco.productsservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    @GetMapping()
    public Product getProduct(@RequestParam String id){
        return new Product(id,2000.0,"Notebook","Technology");
    }
}
