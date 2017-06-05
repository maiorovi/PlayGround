package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudConfigServerViaRest {

	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServer.class, args);
	}

	@RequestMapping("/")
	public String query(@RequestParam("p") String requestedProperty) {
		return environment.getProperty(requestedProperty);
	}
}
