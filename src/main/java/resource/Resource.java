package resource;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("test")
public class Resource
{
	@GET
	@Path("")
	@Produces(MediaType.TEXT_PLAIN)
	public Response test(@QueryParam("value") @DefaultValue("0") Number headerValue)
	{
		return Response.ok()
			.entity("ok")
			.header("numeric-header", headerValue)
		.build();
	}
}
