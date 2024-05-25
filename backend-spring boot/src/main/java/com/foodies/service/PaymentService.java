package com.foodies.service;

import com.stripe.exception.StripeException;
import com.foodies.model.Order;
import com.foodies.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
