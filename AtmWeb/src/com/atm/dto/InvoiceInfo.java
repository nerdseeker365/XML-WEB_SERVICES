package com.atm.dto;

public class InvoiceInfo {

	private String invoiceNum;
	private String invoiceGenDate;
	private String status;
	private String denialRsn;
	private String txNo;

	public String getInvoiceNum() {
		return invoiceNum;
	}

	public void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	public String getInvoiceGenDate() {
		return invoiceGenDate;
	}

	public void setInvoiceGenDate(String invoiceGenDate) {
		this.invoiceGenDate = invoiceGenDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDenialRsn() {
		return denialRsn;
	}

	public void setDenialRsn(String denialRsn) {
		this.denialRsn = denialRsn;
	}

	public String getTxNo() {
		return txNo;
	}

	public void setTxNo(String txNo) {
		this.txNo = txNo;
	}

}
