package org.devbrenomoraes.springjpa_project.repositories;

import org.devbrenomoraes.springjpa_project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
