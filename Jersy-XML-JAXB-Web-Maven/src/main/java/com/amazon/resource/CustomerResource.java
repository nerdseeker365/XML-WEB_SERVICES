package com.amazon.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.amazon.domain.Customer;

@Path("/customer")
public class CustomerResource {

	@GET
	@Path("{customerId}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerById(@PathParam("customerId") String customerId) {
		Customer c = new Customer();
		c.setCustomerId(101);
		c.setCustomerName("Ashok");
		c.setCustomerEmail("ashok.b@gmail.com");
		c.setCustomerPhno("+91-9979799");
		return c;
	}

	@POST
	@Path("/addCustomer")
	@Consumes(MediaType.APPLICATION_XML)
	public Response addCustomer(Customer c) {
		String msg = "Customer added successfully..!!";
		return Response.ok(msg).build();
	}

}
