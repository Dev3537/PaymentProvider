package com.paymentprovider.gateway.PaymentProvider.service;

import com.paymentprovider.gateway.PaymentProvider.payload.PaymentResponseDTO;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentProviderServiceImpl implements PaymentProviderService {
	@Override
	public PaymentResponseDTO executePayment (String paymentMethod) {
		PaymentResponseDTO responseDTO = new PaymentResponseDTO();
		if (paymentMethod.equalsIgnoreCase("UPI")) {
			responseDTO.setPaymentMethod("UPI");
		} else if (paymentMethod.equalsIgnoreCase("CC")) {
			responseDTO.setPaymentMethod("Credit Card");
		} else {
			responseDTO.setPaymentMethod("Debit Card");
		}

		responseDTO.setPaymentProviderId(UUID.randomUUID().toString());
		responseDTO.setPaymentProviderStatus("Success");
		responseDTO.setPaymentProviderName("Payment_Gateway_Provider.mvn");
		return responseDTO;

	}
}
