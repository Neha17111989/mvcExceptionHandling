package com.altimetrik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.exception.OrderException;
import com.altimetrik.service.OrderService;

@RestController
public class CustomRestController {

	@Autowired
	OrderService service;

	@RequestMapping("/getPrice/{productName}")
	@GetMapping
	public double getPrice(@PathVariable String productName) throws OrderException {
		double price = service.getPriceByName(productName);
		return price;
	}
}
