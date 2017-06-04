package app.restcontroller;

import app.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/")
public class DefaultRestController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloRequest() {
		return "Hello World!";
	}

	@RequestMapping(value = "user", method = RequestMethod.GET, produces = {"application/xml", "application/json"})
	public User getUser() {
		return new User("Egor", 26);
	}

}
