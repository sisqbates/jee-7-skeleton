import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import ejb.TestBean;

@Path("/resource")
public class JaxRSTest {

	@Inject
	private TestBean bean;

	@GET
	@Produces("text/plain")
	public String list() {
		return bean.hello();
	}

	@GET
	@Path("{id}")
	@Produces("text/plain")
	public String get(@PathParam("id") String id) {
		return "Get resource with id " + id;
	}
}