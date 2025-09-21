package com.pulse1.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Map;

@RestController
@RequestMapping("/api/payments")
@CrossOrigin(origins = "*")
public class PaymentController {

    // Placeholder endpoints for Razorpay integration
    @PostMapping("/create-order")
    public ResponseEntity<?> createOrder(@RequestBody Map<String,Object> body) {
        // In real app: call Razorpay SDK to create order and return order id
        return ResponseEntity.ok(Map.of("orderId", "rzp_test_order_12345", "amount", body.get("amount")));
    }

    @PostMapping("/verify")
    public ResponseEntity<?> verify(@RequestBody Map<String,String> body) {
        // In real app: verify payment signature
        return ResponseEntity.ok(Map.of("status","VERIFIED"));
    }
}