package com.project1.course.repositories;

import com.project1.course.entities.Category;
import com.project1.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
