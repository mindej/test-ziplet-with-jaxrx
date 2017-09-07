package test.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import test.rest.recource.TestResource;

@ApplicationPath("/rest/*")
public class RestApplication extends Application {

	private static final Logger log = LoggerFactory.getLogger(RestApplication.class);

	@Override
	public Set<Class<?>> getClasses() {
		log.error("Init");
		final Set<Class<?>> result = new HashSet<Class<?>>();
		result.add(TestResource.class);
		return result;
	}
}
