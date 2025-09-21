package com.pulse1.service;

import com.pulse1.model.Order;
import com.pulse1.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repo;
    public OrderService(OrderRepository repo) { this.repo = repo; }
    public List<Order> getAll() { return repo.findAll(); }
    public Order place(Order o) { o.setStatus("ORDER_PLACED"); return repo.save(o); }
}