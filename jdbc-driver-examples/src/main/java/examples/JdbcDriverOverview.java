package examples;

import examples.entity.Employee;
import examples.mappers.EmployeesRowMapper;
import examples.mappers.RowMapper;
import examples.processor.ResultSetProcessor;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JdbcDriverOverview {
	private static final String SELECT_EMPLOYEES = "SELECT * FROM EMPLOYEES";

	private BasicDataSource basicDataSource;
	private Connection connection;

	public JdbcDriverOverview(BasicDataSource basicDataSource) {
		this.basicDataSource = basicDataSource;
	}

	public List<Employee> getAllEmployees(ResultSetProcessor resultSetProcessor) throws SQLException {
		Connection connection = getConnection();

		PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEES);
		ResultSet resultSet = preparedStatement.executeQuery();

		return resultSetProcessor.asList(resultSet, new EmployeesRowMapper());
	}

	private Connection getConnection() throws SQLException {
		if (connection == null ) {
				connection = basicDataSource.getConnection();
		}

		return connection;
	}


}
