package com.atm.consumer;

import java.io.IOException;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class AtmWebConsumerHandler implements SOAPHandler<SOAPMessageContext> {

	public boolean handleMessage(SOAPMessageContext context) {
		System.out.println("Consumer : handleMessage() Begin");
		Boolean outBoundProperty = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		// If its an outgoing message from client, then outBoundProperty will be
		// true
		if (outBoundProperty) {
			try {
				SOAPMessage soapMsg = context.getMessage();
				SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
				SOAPHeader soapHeader = soapEnv.getHeader();

				// if no header, add the header
				if (soapHeader == null) {
					soapHeader = soapEnv.addHeader();
				}
				String secretKey = getSecretKey();

				// add a soap header called "secretkey"
				QName qname = new QName("http://service.atm.com/", "PROPERTY");
				SOAPHeaderElement soapHeaderElement = soapHeader.addHeaderElement(qname);

				soapHeaderElement.setActor(SOAPConstants.URI_SOAP_ACTOR_NEXT);
				// Add Secret Key to SOAP header
				soapHeaderElement.addTextNode(secretKey);
				soapMsg.saveChanges();

				// Output the message to console
				soapMsg.writeTo(System.out);

			} catch (SOAPException e) {
				System.err.println(e);
			} catch (IOException e) {
				System.err.println(e);
			}

		}
		// Returning true makes other handler chain to continue the execution
		return true;
	}

	public boolean handleFault(SOAPMessageContext context) {
		System.out.println("Consumer : handleFault() Begin");
		return true;
	}

	public void close(MessageContext context) {
		System.out.println("Consumer : close() Begin");

	}

	public Set<QName> getHeaders() {
		System.out.println("Consumer : getHeaders() Begin");
		return null;
	}

	private String getSecretKey() {
		// This is the secret key which shared by provider
		return "abc@123";
	}

}
