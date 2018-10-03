package com.universal.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/bookstore")
public class BookResource {

	@GET
	@Path("/price/{isbn}")
	public String getPrice(@PathParam("isbn") String isbn) {
		System.out.println("ISBN : " + isbn);
		String msg = "The Price of the book is $250";
		return msg;
	}

	@GET
	@Path("/getPrice/{author}/{name}")
	public Response getPrice(@PathParam("author") String author,
			@PathParam("name") String name) {
		System.out.println("Author name : "+author);
		System.out.println("Book Name : "+name);
		String msg = "The Price of the book is $450";
		return Response.ok(msg).build();
	}
}
