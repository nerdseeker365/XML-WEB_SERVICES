package com.hps.converters;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import com.hps.domain.Student;

public class JsonStringToObjectConverter {

	public static void main(String[] args) throws Exception {
		File f = new File("student.json");
		ObjectMapper mapper = new ObjectMapper();
		Student s = mapper.readValue(f, Student.class);
		System.out.println(s);
	}

}
