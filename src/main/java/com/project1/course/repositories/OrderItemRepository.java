package com.project1.course.repositories;

import com.project1.course.entities.OrderItem;
import com.project1.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
