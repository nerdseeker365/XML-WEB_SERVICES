package com.amazon.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "customer")
@XmlAccessorType (XmlAccessType.FIELD)
public class Customer {

	@XmlAttribute(name = "customer-id")
	private int customerId;

	@XmlElement
	private String customerName;

	@XmlElement
	private String customerEmail;

	@XmlElement
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