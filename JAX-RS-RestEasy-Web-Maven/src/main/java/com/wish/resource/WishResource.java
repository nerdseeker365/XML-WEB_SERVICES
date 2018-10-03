package com.wish.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/wish")
public class WishResource {

	@GET
	@Path("/{name}")
	public Response wish(@PathParam("name") String name) {
		String msg = name + ", Welcome to RESTFul Services..!!";
		return Response.ok(msg).build();
	}
}
