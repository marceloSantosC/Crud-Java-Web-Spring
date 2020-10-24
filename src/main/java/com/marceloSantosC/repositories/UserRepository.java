package com.marceloSantosC.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marceloSantosC.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {}
