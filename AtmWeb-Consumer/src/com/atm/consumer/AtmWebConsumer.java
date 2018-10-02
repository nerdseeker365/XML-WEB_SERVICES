package com.atm.consumer;

import com.atm.service.AccountInfo;
import com.atm.service.AtmImplService;
import com.atm.service.IAtm;
import com.atm.service.InvoiceInfo;
import com.atm.service.TransactionInfo;

public class AtmWebConsumer {

	public static void main(String[] args) {

		AccountInfo ainfo = new AccountInfo();
		ainfo.setAccId("797979");
		ainfo.setBranch("SrNagar");
		ainfo.setName("Ashok");

		TransactionInfo tinfo = new TransactionInfo();
		tinfo.setAmount("1500");
		tinfo.setAtmId("7979");
		tinfo.setPin("0000");

		AtmImplService service = new AtmImplService();
		
		IAtm atmPort = service.getAtmImplPort();
		
		InvoiceInfo info = atmPort.withdraw(ainfo, tinfo);

		
		System.out.println("===============Provider Response - Begin==============");
		System.out.println("Invoice Num : - "+info.getInvoiceNum());
		System.out.println("Transaction Status :-"+info.getStatus());
		System.out.println("===============Provider Response - End==============");

	}
}
