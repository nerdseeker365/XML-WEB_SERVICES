package com.universal.resources;

import javax.ws.rs.BeanParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.universal.domain.User;

@Path("/user")
public class UserResource {

	@POST
	@Path("/addUser")
	public Response addUser(@BeanParam User u) {
		System.out.println(u);
		return Response.ok("Success").build();
	}
}
