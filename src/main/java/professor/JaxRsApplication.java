package professor;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class JaxRsApplication extends Application {

	private Set<Object> singletons = new HashSet<Object>();

	public JaxRsApplication() {
		singletons.add(new ProfessorRest());
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}