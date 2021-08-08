package servicioweb;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/rest")
public class Rest {
	
	@Path("/test")
	@GET
	public static String test() {
		return "Prueba rest";
	}

}
