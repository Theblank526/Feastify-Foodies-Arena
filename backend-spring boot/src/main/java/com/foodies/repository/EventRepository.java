package com.foodies.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodies.model.Events;

public interface EventRepository extends JpaRepository<Events, Long>{

	public List<Events> findEventsByRestaurantId(Long id);
}
