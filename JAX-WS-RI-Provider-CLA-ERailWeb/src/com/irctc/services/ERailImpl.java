package com.irctc.services;

import java.util.Date;

import javax.jws.WebService;

import com.irctc.req.bindings.JourneyInfoType;
import com.irctc.req.bindings.PassengerInfoType;
import com.irctc.res.bindings.TicketType;

@WebService(endpointInterface = "com.irctc.services.ERail")
public class ERailImpl implements ERail {

	@Override
	public TicketType bookTicket(PassengerInfoType p, JourneyInfoType j) {
		// business logic here

		TicketType t = new TicketType();
		t.setTicketNum(101);
		t.setPassengerName(p.getName());
		t.setBookedAt("14:30");
		t.setDoj("20-Sep-2018");
		t.setPnr(797968688);
		t.setFrom("Secunderabad");
		t.setTo("Pune");
		t.setStatus("Confirmed");
		return t;
	}

}
