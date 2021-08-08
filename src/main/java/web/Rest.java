package web;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import entities.Persona;
import services.ServicioPersona;


@Path("/rest")
public class Rest {
	
	@Path("/test")
	@GET
	public static String test() {
		return "Prueba rest";
	}
	
	@Path("/response")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public static Response testPython(Persona p) {
		p = ServicioPersona.upper(p);
		return Response.status(200).entity(p).build();
	}

}
