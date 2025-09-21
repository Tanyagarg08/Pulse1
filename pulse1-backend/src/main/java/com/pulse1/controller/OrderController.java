package com.pulse1.controller;

import com.pulse1.model.Order;
import com.pulse1.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "*")
public class OrderController {
    private final OrderService service;
    public OrderController(OrderService service) { this.service = service; }
    @GetMapping public List<Order> all() { return service.getAll(); }
    @PostMapping public Order place(@RequestBody Order o) { return service.place(o); }
}