package com.foodies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodies.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
