package springbook.learningtest.spring.web;

import org.junit.Test;

import springbook.learningtest.spring.web.hello.HelloSpring;

public class ConfigurableDispatcherServletTest {

	
	@Test
	public void servletTest() {
		ConfigurableDispatcherServlet servlet = new ConfigurableDispatcherServlet();
		servlet.setRelativeLocations(getClass(), "spring-servlet.xml");
		
//		servlet.setClasses(HelloSpring.class);
		
	}
}
