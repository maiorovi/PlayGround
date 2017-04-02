package client_app;

import com.gemstone.gemfire.cache.Region;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("spring/gemfire.xml");
		Region<String, String> region = context.getBean("regionA", Region.class);

		System.out.println("output from cache: " + region.get("1"));
	}
}
