package com.insurance.consumer;

import com.insurance.service.EnrollmentInfo;
import com.insurance.service.IInsurance;
import com.insurance.service.InsuranaceImplService;
import com.insurance.service.PersonInfo;

public class InsuranceConsumer {

	public static void main(String[] args) {
		PersonInfo pinfo = new PersonInfo();
		pinfo.setAge(60);

		InsuranaceImplService ser = new InsuranaceImplService();
		IInsurance stub = ser.getInsuranaceImplPort();
		EnrollmentInfo enrol = stub.findPlan(pinfo);
		System.out.println(enrol.getPlanName() + "--" + enrol.getPlanStatus());

	}

}
