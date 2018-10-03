package com.universal.resources;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/student")
public class StudentResource {

	@POST
	@Path("/addStudent")
	public Response addStudent(@FormParam("name") String name,
			@FormParam("email") String email) {
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		String resMsg = "Student added successfully with name : " + name;
		return Response.ok(resMsg).build();
	}
}
