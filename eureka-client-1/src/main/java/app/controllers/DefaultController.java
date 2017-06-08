package app.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

	private Logger log = LoggerFactory.getLogger(DefaultController.class);

	@Value("${words}")
	private String words;

	public DefaultController() {
		log.info("Words are: " + words);
	}

	@RequestMapping("/")
	public String getWord() {
		String[] wordArray = words.split(",");
		int i = (int)Math.round(Math.random() * (wordArray.length - 1));
		return wordArray[i];
	}
}
