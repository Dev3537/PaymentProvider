package com.paymentprovider.gateway.PaymentProvider.controller;

import com.paymentprovider.gateway.PaymentProvider.payload.PaymentResponseDTO;
import com.paymentprovider.gateway.PaymentProvider.service.PaymentProviderService;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PaymentProviderController {

	@Autowired
	PaymentProviderService paymentProviderService;

	@GetMapping("/payment/gateway-proceed/{paymentMethod}")
	public ResponseEntity<PaymentResponseDTO> paymentGateway(@NotNull @PathVariable String paymentMethod){
		PaymentResponseDTO responseDTO = paymentProviderService.executePayment(paymentMethod);
		return ResponseEntity.ok().body(responseDTO);
	}
}
