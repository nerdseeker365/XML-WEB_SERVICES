package com.hp.converters;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hp.domain.Employee;

public class ObjectToJsonConverter {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEmpId(101);
		e.setName("Ashok");
		e.setDesignation("Consultant");
		e.setDepartment("Development");
		e.setSalary(5000);

		//To enable Pretty Printing (Json format)
		//Ignoring the fields which does not have @Expose Annotation
		Gson gson = new GsonBuilder()
					.setPrettyPrinting()
					.excludeFieldsWithoutExposeAnnotation()
					.create();
		String jsonString = gson.toJson(e);
		System.out.println(jsonString);
	}
}
