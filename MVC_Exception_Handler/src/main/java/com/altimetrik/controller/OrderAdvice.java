package com.altimetrik.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.altimetrik.exception.OrderException;
import com.altimetrik.model.OrderExceptionModel;

@ControllerAdvice
public class OrderAdvice {

	@ExceptionHandler(OrderException.class)
	ResponseEntity<OrderExceptionModel> mapException(OrderException exe) {
		OrderExceptionModel obj = new OrderExceptionModel(HttpStatus.INTERNAL_SERVER_ERROR.value(), exe.getMessage());
		
		return new ResponseEntity<OrderExceptionModel>(obj,HttpStatus.INTERNAL_SERVER_ERROR);

	}
}
