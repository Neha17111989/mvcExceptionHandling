package com.altimetrik.model;

public class OrderExceptionModel {

	private int errorId;
	private String msg;

	public int getErrorId() {
		return errorId;
	}

	public OrderExceptionModel(int errorId, String msg) {
		super();
		this.errorId = errorId;
		this.msg = msg;
	}

	public void setErrorId(int errorId) {
		this.errorId = errorId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	

}
