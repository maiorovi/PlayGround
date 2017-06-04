package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class DefaultController {

	@RequestMapping("/")
	public String index(Map<String, String> model) {
		model.put("PageTitle", "Hello Page");
		model.put("name", "Egor");
		return "index";
	}

	@RequestMapping("/{name}")
	public String greeting(@PathVariable String name, Map<String, String> model) {
		model.put("PageTitle", "Hello Page");
		model.put("name", name);

		return "index";
	}
}