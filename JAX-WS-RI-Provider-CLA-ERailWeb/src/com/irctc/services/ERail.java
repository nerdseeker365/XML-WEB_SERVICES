package com.irctc.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.irctc.req.bindings.JourneyInfoType;
import com.irctc.req.bindings.PassengerInfoType;
import com.irctc.res.bindings.TicketType;

@WebService
public interface ERail {

	@WebMethod
	public @WebResult(name = "Ticket") TicketType bookTicket(
			@WebParam(name = "PassengerInfo") PassengerInfoType p,
			@WebParam(name = "JourneyInfo") JourneyInfoType j);

}
