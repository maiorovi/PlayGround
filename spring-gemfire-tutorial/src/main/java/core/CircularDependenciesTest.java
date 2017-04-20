package core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@ComponentScan(basePackages = "core")
public class CircularDependenciesTest {

	public static void main(String[] args) {
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("core/circular-dep.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CircularDependenciesTest.class);
	}
}
