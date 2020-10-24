package com.marceloSantosC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marceloSantosC.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
