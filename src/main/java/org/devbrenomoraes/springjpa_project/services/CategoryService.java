package org.devbrenomoraes.springjpa_project.services;

import org.devbrenomoraes.springjpa_project.entities.Category;
import org.devbrenomoraes.springjpa_project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAllOrders() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> catObj = repository.findById(id);
        return catObj.get();
    }
}
