package examples;

import examples.entity.Employee;
import examples.processor.ResultSetProcessor;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class OracleJdbcOperationsFacade {

	private ResultSetProcessor resultSetProcessor;
	private JdbcDriverOverview jdbcDriverOverview;

	public OracleJdbcOperationsFacade(ResultSetProcessor resultSetProcessor, JdbcDriverOverview jdbcDriverOverview) {
		this.resultSetProcessor = resultSetProcessor;
		this.jdbcDriverOverview = jdbcDriverOverview;
	}

	public List<Employee> getAllEmployees() {
		try {
			return jdbcDriverOverview.getAllEmployees(resultSetProcessor);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public String sayHello(String name) {
		try {
			return jdbcDriverOverview.callHelloProcedure(name);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
