package com.marceloSantosC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marceloSantosC.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {}
