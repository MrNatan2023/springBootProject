package com.project1.course.repositories;

import com.project1.course.entities.Category;
import com.project1.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
