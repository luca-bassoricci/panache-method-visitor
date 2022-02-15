package reactivedevmode;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("test")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class Resource
{
	@Path("")
	@GET
	public String className()
	{
		return Resource.class.getName();
	}

	@Context
	ResourceContext resourceContext;
	
	@Path("sub")
	public SubResource subresource()
	{
		return resourceContext.getResource(SubResource.class);
	}
}
