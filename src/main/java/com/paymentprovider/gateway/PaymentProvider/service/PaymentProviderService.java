package com.paymentprovider.gateway.PaymentProvider.service;

import com.paymentprovider.gateway.PaymentProvider.payload.PaymentResponseDTO;

public interface PaymentProviderService {
	PaymentResponseDTO executePayment (String paymentMethod);
}
