package com.universal.resources;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/car")
public class CarResource {

	@GET
	@Path("/availability")
	public Response getAvailability(
			@QueryParam("name") @DefaultValue("Swift") String name) {
		System.out.println("getAvailability : Called");
		String resMsg = null;
		if ("Benz".equals(name)) {
			resMsg = "Benz cars are not available..!!";
		} else if ("Audi".equals(name)) {
			resMsg = "Audi cars are available";
		} else if ("Swift".equals(name)) {
			resMsg = "Swift cars are available";
		}
		return Response.ok(resMsg).build();
	}

	@GET
	@Path("/order/{brand}/{model}")
	public String orderCar(@PathParam("brand") String brand,
			@PathParam("model") int model, @MatrixParam("color") String color) {
		System.out.println("Brand : " + brand);
		System.out.println("Model : " + model);
		System.out.println("Color : " + color);
		return "Car orderd successfully..!";
	}

}
