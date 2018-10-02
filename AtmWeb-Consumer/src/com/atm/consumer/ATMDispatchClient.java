package com.atm.consumer;

import java.io.IOException;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

public class ATMDispatchClient {

	private final static String PORT_NM = "AtmImplPort";
	private final static String TRGT_NMSPC = "http://service.atm.com/";
	private final static String TYPE_NMSPC = "http://service.atm.com/";
	private final static String ENDPOINT_URL = "http://localhost:8086/AtmWeb/withdraw";
	private final static String SERVICE_NM = "AtmImplService";

	public static void main(String[] args) throws SOAPException, IOException {

		Service atmService = Service.create(new QName(TRGT_NMSPC, SERVICE_NM));
		atmService.addPort(new QName(TRGT_NMSPC, PORT_NM),SOAPBinding.SOAP11HTTP_BINDING, ENDPOINT_URL);

		Dispatch<SOAPMessage> atmSOAPPortDispatcher = atmService.createDispatch(new QName(TRGT_NMSPC, PORT_NM),	SOAPMessage.class, Service.Mode.MESSAGE);
		MessageFactory mfactory = MessageFactory.newInstance();
		
		SOAPMessage request = mfactory.createMessage();

		SOAPPart part = request.getSOAPPart();
		SOAPEnvelope envelope = part.getEnvelope();
	
		SOAPBody body = envelope.getBody();

		SOAPElement rootElem = body.addChildElement("withdraw", "wsdl",TRGT_NMSPC);

		// accountInfo
		SOAPElement accInfoElem = rootElem.addChildElement("accountInfo","typ", TYPE_NMSPC);
		accInfoElem.addChildElement("accId").addTextNode("ac1");
		accInfoElem.addChildElement("branch").addTextNode("s.r nagar");
		accInfoElem.addChildElement("name").addTextNode("john");

		// transactionInfo
		SOAPElement tranInfo = rootElem.addChildElement("transactionInfo","typ", TYPE_NMSPC);
		tranInfo.addChildElement("amount").addTextNode("242");
		tranInfo.addChildElement("atmId").addTextNode("ATM111");
		tranInfo.addChildElement("pin").addTextNode("0000");

		request.writeTo(System.out);

		SOAPMessage response = atmSOAPPortDispatcher.invoke(request);
		response.writeTo(System.out);
	}
}
