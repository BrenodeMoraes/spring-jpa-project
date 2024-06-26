package org.devbrenomoraes.springjpa_project.resources;

import org.devbrenomoraes.springjpa_project.entities.User;
import org.devbrenomoraes.springjpa_project.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService service;
    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> userList = service.findAllUsers();
        return ResponseEntity.ok().body(userList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findUserById(@PathVariable Long id) {
        User userObj = service.findById(id);
        return ResponseEntity.ok().body(userObj);
    }
}
