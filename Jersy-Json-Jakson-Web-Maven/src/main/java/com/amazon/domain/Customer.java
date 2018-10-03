package com.amazon.domain;

import org.codehaus.jackson.annotate.JsonProperty;

public class Customer {

	@JsonProperty("customer-id")
	private int customerId;

	@JsonProperty("customer-name")
	private String customerName;

	@JsonProperty("customer-email")
	private String customerEmail;

	@JsonProperty("customer-phno")
	private String customerPhno;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerPhno() {
		return customerPhno;
	}

	public void setCustomerPhno(String customerPhno) {
		this.customerPhno = customerPhno;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", customerEmail=" + customerEmail
				+ ", customerPhno=" + customerPhno + "]";
	}

}