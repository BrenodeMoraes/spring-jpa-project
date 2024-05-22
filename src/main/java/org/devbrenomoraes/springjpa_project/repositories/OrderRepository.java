package org.devbrenomoraes.springjpa_project.repositories;

import org.devbrenomoraes.springjpa_project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
