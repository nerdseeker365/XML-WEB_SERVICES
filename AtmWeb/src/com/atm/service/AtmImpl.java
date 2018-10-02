package com.atm.service;

import javax.jws.HandlerChain;
import javax.jws.WebService;

import com.atm.dto.AccountInfo;
import com.atm.dto.InvoiceInfo;
import com.atm.dto.TransactionInfo;

@HandlerChain(file = "handler-chain.xml")
@WebService(endpointInterface = "com.atm.service.IAtm")
public class AtmImpl implements IAtm {

	@Override
	public InvoiceInfo withdraw(AccountInfo ainfo, TransactionInfo tinfo) {
		// business logic to withdraw goes here
		
		// Construcing reponse object
		InvoiceInfo invc = new InvoiceInfo();
		invc.setInvoiceGenDate("10-04-2018");
		invc.setInvoiceNum("68686868");
		invc.setStatus("Sucess");
		invc.setTxNo("4647868");
		
		//returing response
		return invc;
	}
}
