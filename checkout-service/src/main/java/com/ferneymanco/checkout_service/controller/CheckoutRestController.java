package com.ferneymanco.checkout_service.controller;

import com.ferneymanco.checkout_service.model.Checkout;
import com.ferneymanco.checkout_service.service.ICheckoutService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/checkout")
public class CheckoutRestController {

    private final ICheckoutService checkoutService;

    public CheckoutRestController(ICheckoutService checkoutService) {
        super();
        this.checkoutService = checkoutService;
    }

    @GetMapping()
    public Checkout getCheckout(@RequestParam List<String> productIds){
        return checkoutService.buildCheckout(productIds);
    }
}
