package com.marceloSantosC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marceloSantosC.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}
