package com.marceloSantosC.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marceloSantosC.entities.Order;
import com.marceloSantosC.services.OrderService;

@RestController
@RequestMapping(value = "/order")
public class OrderResouce {
	@Autowired
	private OrderService orderSerive;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		return ResponseEntity.ok(orderSerive.findAll());
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		return ResponseEntity.ok(orderSerive.findById(id));
	}
}
