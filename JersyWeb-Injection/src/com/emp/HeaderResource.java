package com.emp;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;

@Path("/header")
public class HeaderResource {

	@GET
	public Response getHeader(@HeaderParam("User-Agent") String uagnt) {
		String msg = " User Agent : " + uagnt;
		return Response.ok(msg).build();
	}

	@GET
	@Path("/all")
	public Response getAllHeaders(@Context HttpHeaders headers) {
		MultivaluedMap<String, String> map = headers.getRequestHeaders();
		String msg = "Headers :  " + map;
		return Response.ok(msg).build();
	}

}
