package reactivedevmode;

import javax.enterprise.context.Dependent;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Dependent
public class SubResource
{
	@Path("")
	@GET
	public String className()
	{
		return SubResource.class.getName();
	}
}
