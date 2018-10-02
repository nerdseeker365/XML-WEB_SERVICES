package com.nit.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface GreetService {

	@WebMethod
	public @WebResult String greetResource(@WebParam String name);

}
