package com.atm.service;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

public class AuthenticateHandler implements SOAPHandler<SOAPMessageContext> {

	//Choosing some random secret key
	private static final String SECRET_KEY = "Ashok-IT";

	@Override
	public void close(MessageContext ctx) {
	}

	@Override
	public boolean handleFault(SOAPMessageContext arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * This method is used to handle inbound and outbound soap msgs
	 */
	@Override
	public boolean handleMessage(SOAPMessageContext ctx) {

		Boolean outbound = (Boolean) ctx
				.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (!outbound) {
			SOAPMessage soapMsg = ctx.getMessage();
			try {
				soapMsg.writeTo(System.out);
				// Grabbing soap header from soap msg
				SOAPHeader soapHeader = soapMsg.getSOAPHeader();
				Iterator<?> headerIterator = soapHeader
						.extractHeaderElements(SOAPConstants.URI_SOAP_ACTOR_NEXT);
				// If soap header presented then process
				if (headerIterator.hasNext()) {
					Node node = (Node) headerIterator.next();
					if (node != null) {
						String secretKey = node.getValue();
						if (SECRET_KEY.equals(secretKey.trim())) {
							// Key matching.. process the request
							return true;
						} else {
							// Key did not match
							// Throw SOAP Fault exception
							generateSoapFaultException(soapMsg);
						}
					}
				} else {
					// Header is not there
					// Throw SOAP Fault exception
					generateSoapFaultException(soapMsg);
				}
			} catch (SOAPException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * This method is used to generate SOAP Fault Exception when secret key is
	 * not matched
	 * 
	 * @param soapMsg
	 */
	public void generateSoapFaultException(SOAPMessage soapMsg) {
		SOAPBody soapBody;
		try {
			soapBody = soapMsg.getSOAPBody();
			SOAPFault soapFault = soapBody.addFault();
			soapFault.setFaultString("Secret Key is not matched...!!");
			throw new SOAPFaultException(soapFault);
		} catch (SOAPException e) {
			e.printStackTrace();
		}
	}
}
