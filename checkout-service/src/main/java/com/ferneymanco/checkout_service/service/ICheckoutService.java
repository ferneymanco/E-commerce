package com.ferneymanco.checkout_service.service;

import com.ferneymanco.checkout_service.model.Checkout;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ICheckoutService {
    public Checkout buildCheckout(List<String> productIds);
}
