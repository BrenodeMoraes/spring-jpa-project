package org.devbrenomoraes.springjpa_project.services;

import org.devbrenomoraes.springjpa_project.entities.Order;
import org.devbrenomoraes.springjpa_project.entities.User;
import org.devbrenomoraes.springjpa_project.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAllOrders() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> orderObj = repository.findById(id);
        return orderObj.get();
    }
}
