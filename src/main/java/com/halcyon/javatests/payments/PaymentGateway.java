package com.halcyon.javatests.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);

}
