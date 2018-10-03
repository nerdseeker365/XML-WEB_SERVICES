package com.universal.resources;

import javax.ws.rs.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/mobile")
public class MobileResource {

	@GET
	@Path("/order/{name}")
	public Response placeOrder(@PathParam("name") String name, 
			@MatrixParam("model") String model,
			@MatrixParam("color") String color) {
		
		System.out.println("Name : "+name);
		System.out.println("Model : "+model);
		System.out.print("Color : "+color);
		
		String msg = "Order Placed successfully..!!";
		return Response.ok(msg).build();
	}
}
