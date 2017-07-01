package examples;

import examples.entity.Employee;
import examples.mappers.EmployeesRowMapper;
import examples.processor.ResultSetProcessor;
import oracle.jdbc.OracleType;
import oracle.jdbc.OracleTypes;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.*;
import java.util.List;

public class JdbcDriverOverview {
	private static final String SELECT_EMPLOYEES = "SELECT * FROM EMPLOYEES";
	private static final String SAY_HELLO_CALL = "call sayHello(?, ?)";
	private static final String GET_SUM = "{? = call MY_SUM(?, ?) }";

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

	public String callHelloProcedure(String name) throws SQLException {
		connection = getConnection();
		CallableStatement callableStatement = connection.prepareCall(SAY_HELLO_CALL);
		callableStatement.setString("NAME", name);
		callableStatement.registerOutParameter("OUTPUT", OracleType.VARCHAR2.getVendorTypeNumber());
		callableStatement.execute();

		return callableStatement.getString("OUTPUT");
	}

	public Integer callGetSum(Integer a, Integer b) throws SQLException {
		connection = getConnection();
		ResultSet rs = null;
		CallableStatement callableStatement = connection.prepareCall(GET_SUM);
		callableStatement.setInt(2, a);
		callableStatement.setInt(3, b);
		callableStatement.registerOutParameter(1, OracleTypes.INTEGER);
		callableStatement.execute();

		return callableStatement.getInt(1);
	}

	private Connection getConnection() throws SQLException {
		if (connection == null) {
			connection = basicDataSource.getConnection();
		}

		return connection;
	}


}
