package examples.mappers;

import examples.entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeesRowMapper implements RowMapper<Employee> {

	@Override
	public Employee map(ResultSet resultSet) throws SQLException {
		Employee employee = new Employee();

		employee.setName(resultSet.getString("NAME"));
		employee.setAge(resultSet.getInt("AGE"));
		employee.setSalary(resultSet.getInt("SALARY"));

		return employee;
	}
}
