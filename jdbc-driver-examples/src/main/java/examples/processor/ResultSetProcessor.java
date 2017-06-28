package examples.processor;

import examples.entity.Employee;
import examples.mappers.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResultSetProcessor {

	public <T> List<T> asList(ResultSet resultSet, RowMapper<T> rowMapper) throws SQLException {
		ArrayList<T> arrayList = new ArrayList<>();

		while(resultSet.next()) {
			arrayList.add(rowMapper.map(resultSet));
		}

		return arrayList;
	}
}
