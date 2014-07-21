import java.util.Collections;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/rest")
public class JaxRSApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		return Collections.singleton(JaxRSTest.class);
	}

}