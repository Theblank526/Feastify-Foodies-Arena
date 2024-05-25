package com.foodies.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodies.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
