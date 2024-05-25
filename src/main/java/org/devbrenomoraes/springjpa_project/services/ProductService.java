package org.devbrenomoraes.springjpa_project.services;

import org.devbrenomoraes.springjpa_project.entities.Product;
import org.devbrenomoraes.springjpa_project.entities.User;
import org.devbrenomoraes.springjpa_project.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAllUsers() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> productObj = repository.findById(id);
        return productObj.get();
    }
}
