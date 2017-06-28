package demo;

import config.DataSourceConfig;
import examples.OracleJdbcOperationsFacade;
import examples.entity.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DataSourceConfig.class);

		OracleJdbcOperationsFacade oracleJdbcOperationsFacade = applicationContext.getBean("jdbcFacade", OracleJdbcOperationsFacade.class);

		List<Employee> employeeList = oracleJdbcOperationsFacade.getAllEmployees();
		String output = employeeList.stream().map(Employee::toString).collect(Collectors.joining("\n"));

		System.out.println(output);

		System.out.println(oracleJdbcOperationsFacade.sayHello("QQQ"));
	}
}
