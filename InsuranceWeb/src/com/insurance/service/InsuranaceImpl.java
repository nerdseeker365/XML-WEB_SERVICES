package com.insurance.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.insurance.service.IInsurance")
public class InsuranaceImpl implements IInsurance {

	@Override
	public EnrollmentInfo findPlan(PersonInfo pinfo) {
		EnrollmentInfo info = new EnrollmentInfo();

		if (pinfo.getAge() >= 60) {
			info.setEnrollmentId(688686);
			info.setPlanName("SNAP");
			info.setPlanStatus("Approved");
			info.setPlanStartDt("10-04-2018");
			info.setPlanEndDt("10-07-2018");
			info.setBenefitAmt(350.00);
		} else if (pinfo.getAge() < 25) {
			info.setEnrollmentId(688686);
			info.setPlanName("RIW");
			info.setPlanStatus("Approved");
			info.setPlanStartDt("10-04-2018");
			info.setPlanEndDt("10-07-2018");
			info.setBenefitAmt(150.00);
		}
		return info;
	}
}