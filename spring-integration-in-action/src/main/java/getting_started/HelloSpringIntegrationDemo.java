package getting_started;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

public class HelloSpringIntegrationDemo {

	public static void main(String[] args) {
		String springCfg = "hello-config.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(springCfg);
		MessageChannel channel = context.getBean("names", MessageChannel.class);
		Message<String> message = MessageBuilder.withPayload("World").build();

		channel.send(message);
	}

}
