package org.devbrenomoraes.springjpa_project.resources;

import org.devbrenomoraes.springjpa_project.entities.Product;
import org.devbrenomoraes.springjpa_project.entities.User;
import org.devbrenomoraes.springjpa_project.services.ProductService;
import org.devbrenomoraes.springjpa_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;
    @GetMapping
    public ResponseEntity<List<Product>> findAllProducts() {
        List<Product> productList = service.findAllUsers();
        return ResponseEntity.ok().body(productList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findUserById(@PathVariable Long id) {
        Product productObj = service.findById(id);
        return ResponseEntity.ok().body(productObj);
    }
}
