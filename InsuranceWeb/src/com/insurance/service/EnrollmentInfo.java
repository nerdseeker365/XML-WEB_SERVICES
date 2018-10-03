package com.insurance.service;

public class EnrollmentInfo {

	private Integer enrollmentId;
	private String planStartDt;
	private String planEndDt;
	private String planName;
	private String planStatus;
	private Double benefitAmt;

	public Integer getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(Integer enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public String getPlanStartDt() {
		return planStartDt;
	}

	public void setPlanStartDt(String planStartDt) {
		this.planStartDt = planStartDt;
	}

	public String getPlanEndDt() {
		return planEndDt;
	}

	public void setPlanEndDt(String planEndDt) {
		this.planEndDt = planEndDt;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Double getBenefitAmt() {
		return benefitAmt;
	}

	public void setBenefitAmt(Double benefitAmt) {
		this.benefitAmt = benefitAmt;
	}

}
