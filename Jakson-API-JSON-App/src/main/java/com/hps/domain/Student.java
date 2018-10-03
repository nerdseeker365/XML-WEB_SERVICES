package com.hps.domain;

import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.hps.converters.DateSerializer;

public class Student {

	private Integer sid;
	private String sname;
	private String semail;
	private Integer rank;
	
	@JsonSerialize(using=DateSerializer.class)
	private Date dob;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public Integer getRank() {
		return rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail="
				+ semail + ", rank=" + rank + ", dob=" + dob + "]";
	}

}
