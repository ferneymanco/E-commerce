package com.ferneymanco.checkout_service.implementation;

import com.ferneymanco.checkout_service.dto.Product;
import com.ferneymanco.checkout_service.model.Checkout;
import com.ferneymanco.checkout_service.service.ICheckoutService;
import com.ferneymanco.checkout_service.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckoutService implements ICheckoutService {
    private IProductService productService;

        public CheckoutService(IProductService productService){
            this.productService = productService;
        }

        @Override
        public Checkout buildCheckout(List<String> productIds){
            Double total = 0.0;
            for(String id: productIds){
                Product product = productService.getProduct(id);
                System.out.println("Request for "+product.getServiceInstance());
                total += product.getPrice();
            }
            Checkout checkout = new Checkout("123","www.dominio.com/checkout?",total.toString(), List.of("credit_card","COD"));
            return checkout;
        }
}
