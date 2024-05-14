package org.devbrenomoraes.springjpa_project.services;

import org.devbrenomoraes.springjpa_project.entities.User;
import org.devbrenomoraes.springjpa_project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAllUsers() {
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> userObj = repository.findById(id);
        return userObj.get();
    }
}
