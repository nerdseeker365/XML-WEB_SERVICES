package com.nit.services;

import javax.jws.WebService;

@WebService(endpointInterface = "com.nit.services.GreetService")
public class GreetServiceImpl implements GreetService {

	@Override
	public String greetResource(String name) {

		String greetMsg = "Hello " + name
				+ ", Welcome to SOAP Based Webservices..!!";

		return greetMsg;
	}

}
