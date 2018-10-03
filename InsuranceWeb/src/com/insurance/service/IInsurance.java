package com.insurance.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IInsurance {

	@WebMethod
	public EnrollmentInfo findPlan(PersonInfo pinfo);

}
