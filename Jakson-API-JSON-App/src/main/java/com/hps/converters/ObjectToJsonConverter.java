package com.hps.converters;

import java.util.Date;

import org.codehaus.jackson.map.ObjectMapper;

import com.hps.domain.Student;

public class ObjectToJsonConverter {

	public static void main(String[] args) throws Exception {

		Student s = new Student();
		s.setSid(101);
		s.setSname("Ashok Bollepalli");
		s.setSemail("ashok@hps.com");
		s.setRank(10);
		s.setDob(new Date());

		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(s);
		System.out.println(jsonString);

		String jsonPrettyStr = mapper.writerWithDefaultPrettyPrinter()
							   .writeValueAsString(s);
		System.out.println("\n\njson output in pretty print mode:\n");
		System.out.println(jsonPrettyStr);

	}

}
