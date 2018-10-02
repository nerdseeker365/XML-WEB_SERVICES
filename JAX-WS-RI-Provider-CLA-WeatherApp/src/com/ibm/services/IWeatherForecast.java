package com.ibm.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IWeatherForecast {

	@WebMethod
	public @WebResult(name = "response") double getTemperature(
			@WebParam(name = "zipcode") int zipcode);

	@WebMethod
	public @WebResult(name = "response") boolean willItRainToday(
			@WebParam(name = "zipcode") int zipcode);

}
