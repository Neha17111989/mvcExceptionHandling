package com.altimetrik.service;

import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.dao.OderDAO;
import com.altimetrik.exception.OrderException;
import com.altimetrik.model.Order;
import com.altimetrik.model.OrderExceptionModel;

@Service
public class OrderService {

	@Autowired
	OderDAO dao;

	@PostConstruct
	public void addData2DB() {
		List<Order> al = new ArrayList<Order>();
		Order o1=new Order(121, "iphone", "Mobile", 19.0d);
		Order o2=new Order(122, "FZ", "Bike", 1244.88d);
		dao.save(o1);
		dao.save(o2);

	}

	public double getPriceByName(String odderName) throws OrderException {
		Order order=null;
		double price=0.0;
		try {
			 order = dao.findByodderName(odderName);
			 price= order.getPrice();
		} catch (Exception e) {// TODO: handle exception
			throw new OrderException("No data available for this product name");
		}
		
		return price;

	}
}
