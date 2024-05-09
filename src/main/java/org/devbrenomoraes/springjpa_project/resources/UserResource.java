package org.devbrenomoraes.springjpa_project.resources;

import org.devbrenomoraes.springjpa_project.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAllUsers() {
        User u = new User(1L, "Fulano", "fulano@email.com","81940028922", "12345");
        return ResponseEntity.ok().body(u);
    }
}
