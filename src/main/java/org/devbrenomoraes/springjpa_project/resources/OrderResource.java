package org.devbrenomoraes.springjpa_project.resources;

import org.devbrenomoraes.springjpa_project.entities.Order;
import org.devbrenomoraes.springjpa_project.entities.User;
import org.devbrenomoraes.springjpa_project.services.OrderService;
import org.devbrenomoraes.springjpa_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService service;
    @GetMapping
    public ResponseEntity<List<Order>> findAllOrders() {
        List<Order> orderList = service.findAllOrders();
        return ResponseEntity.ok().body(orderList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findUserById(@PathVariable Long id) {
        Order orderObj = service.findById(id);
        return ResponseEntity.ok().body(orderObj);
    }
}
