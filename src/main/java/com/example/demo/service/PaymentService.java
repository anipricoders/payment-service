package com.example.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Payment;
import com.example.demo.repository.PaymentRepository;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    // Create Payment
    public Payment createPayment(Payment payment) {

        payment.setStatus("SUCCESS");

        return paymentRepository.save(payment);
    }

    // Get All Payments
    public List<Payment> getAllPayments() {

        return paymentRepository.findAll();
    }

    // Get Payment By ID
    public Payment getPaymentById(Long id) {

        return paymentRepository.findById(id).orElse(null);
    }
}