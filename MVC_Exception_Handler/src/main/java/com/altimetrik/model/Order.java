package com.altimetrik.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order_TABLE")
public class Order {

	@Id
	private Integer orderId;

	public Order() {
		super();
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public String getOdderName() {
		return odderName;
	}

	public void setOdderName(String odderName) {
		this.odderName = odderName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private String odderName;
	private String category;
	private double price;

	public Order(int i, String string, String string2, double d) {
		orderId = i;
		odderName = string;
		category = string2;
		price = d;
	}

}
