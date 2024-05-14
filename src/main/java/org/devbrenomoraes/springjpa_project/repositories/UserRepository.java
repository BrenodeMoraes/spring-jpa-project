package org.devbrenomoraes.springjpa_project.repositories;

import org.devbrenomoraes.springjpa_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
