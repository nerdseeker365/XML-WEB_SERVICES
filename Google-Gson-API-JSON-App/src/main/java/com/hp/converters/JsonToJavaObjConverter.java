package com.hp.converters;

import java.io.FileReader;

import com.google.gson.Gson;
import com.hp.domain.Employee;

public class JsonToJavaObjConverter {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("EmployeeData.json");
		Gson gson = new Gson();
		Employee emp = gson.fromJson(fr, Employee.class);
		System.out.println(emp);
	}

}
