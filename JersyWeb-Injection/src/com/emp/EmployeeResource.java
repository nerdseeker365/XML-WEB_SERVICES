package com.emp;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("/emp")
public class EmployeeResource {

	@GET
	@Path("/query")
	public Response getEmps(@Context UriInfo info) {
		List<String> idsList = info.getQueryParameters().get("id");
		String msg = "Given Ids are  : " + idsList;
		return Response.ok(msg).build();
	}

}
