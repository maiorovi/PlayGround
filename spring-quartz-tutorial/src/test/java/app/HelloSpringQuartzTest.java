package app;


import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringQuartzTest {

	@Test
	public void helloWorld() throws Exception {
		new ClassPathXmlApplicationContext("classpath:META-INF/simple-app-context.xml");
		Thread.sleep(5000);
	}

	@Test
	public void complexJob() throws Exception {
		new ClassPathXmlApplicationContext("classpath:META-INF/job-detail-factory.xml");
		Thread.sleep(10000);
	}
}
