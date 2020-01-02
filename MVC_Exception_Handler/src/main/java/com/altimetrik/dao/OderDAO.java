package com.altimetrik.dao;

import org.springframework.data.repository.CrudRepository;

import com.altimetrik.model.Order;

public interface OderDAO extends CrudRepository<Order, Integer> {

	 Order findByodderName(String odderName);

	//void save(List<Order> al);
}
