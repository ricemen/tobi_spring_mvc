package springbook.learningtest.spring.web.hello;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class HelloControllerTest {

	@Test
	public void helloControllerTest() throws ServletException, IOException {
		
		// request
		MockHttpServletRequest req = new MockHttpServletRequest("GET", "/hello");
		req.addParameter("name", "Spring");
		
		// response
		MockHttpServletResponse res = new MockHttpServletResponse();
		
		// mock servlet
		SimpleGetServlet servlet = new SimpleGetServlet();
		servlet.service(req, res);
		
		System.out.println(res.getContentAsString());
		
		assertThat(res.getContentAsString(), is("<HTML><BODY>hello Spring</HTML></BODY>"));
		assertThat(res.getContentAsString().contains("hello Spring"), is(true));
		
		
	}
}
