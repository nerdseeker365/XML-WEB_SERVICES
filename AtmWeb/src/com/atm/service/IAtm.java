package com.atm.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.atm.dto.AccountInfo;
import com.atm.dto.InvoiceInfo;
import com.atm.dto.TransactionInfo;

@WebService
public interface IAtm {

	@WebMethod
	public InvoiceInfo withdraw(AccountInfo ainfo, TransactionInfo tinfo);
}
