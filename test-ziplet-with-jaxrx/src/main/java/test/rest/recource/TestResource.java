package test.rest.recource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/test")
public class TestResource {
	private static final Logger log = LoggerFactory.getLogger(TestResource.class);

	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response get() {
		log.debug("Get");
		return Response.ok(new Output("My test responce")).build();

	}
}
