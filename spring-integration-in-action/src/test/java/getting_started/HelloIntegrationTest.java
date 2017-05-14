package getting_started;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:hello-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloIntegrationTest {

	@Autowired
	@Qualifier("names")
	private MessageChannel messageChannel;

	@Test
	public void shouldPrintHelloWorld() throws Exception {
		Message<String> message = MessageBuilder.withPayload("World").build();

		messageChannel.send(message);
	}
}
