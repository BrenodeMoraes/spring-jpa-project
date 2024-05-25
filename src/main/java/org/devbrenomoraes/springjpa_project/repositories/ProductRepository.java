package org.devbrenomoraes.springjpa_project.repositories;

import org.devbrenomoraes.springjpa_project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
