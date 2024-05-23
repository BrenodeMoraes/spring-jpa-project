package org.devbrenomoraes.springjpa_project.resources;

import org.devbrenomoraes.springjpa_project.entities.Category;
import org.devbrenomoraes.springjpa_project.entities.Order;
import org.devbrenomoraes.springjpa_project.services.CategoryService;
import org.devbrenomoraes.springjpa_project.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    @Autowired
    private CategoryService service;
    @GetMapping
    public ResponseEntity<List<Category>> findAllOrders() {
        List<Category> catList = service.findAllOrders();
        return ResponseEntity.ok().body(catList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findUserById(@PathVariable Long id) {
        Category catObj = service.findById(id);
        return ResponseEntity.ok().body(catObj);
    }
}
