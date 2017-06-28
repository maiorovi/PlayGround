package config;

import com.sun.tracing.ProbeName;
import examples.JdbcDriverOverview;
import examples.OracleJdbcOperationsFacade;
import examples.processor.ResultSetProcessor;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:db.properties")
public class DataSourceConfig {

	@Value("${jdbc.driver.className}")
	private String driverClassName;
	@Value("${jdbc.driver.url}")
	private String url;
	@Value("${jdbc.driver.username}")
	private String username;
	@Value("${jdbc.driver.password}")
	private String password;

	@Bean
	public BasicDataSource basicDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl(url);
		basicDataSource.setUsername(username);
		basicDataSource.setPassword(password);
		basicDataSource.setDriverClassName(driverClassName);

		return basicDataSource;
	}

	@Bean
	public JdbcDriverOverview jdbcDriverOverview(BasicDataSource basicDataSource) {
		JdbcDriverOverview jdbcDriverOverview = new JdbcDriverOverview(basicDataSource);

		return jdbcDriverOverview;
	}

	@Bean
	public ResultSetProcessor resultSetProcessor() {
		return new ResultSetProcessor();
	}

	@Bean(name="jdbcFacade")
	public OracleJdbcOperationsFacade oracleJdbcOperationsFacade(ResultSetProcessor resultSetProcessor, JdbcDriverOverview jdbcDriverOverview) {
		return new OracleJdbcOperationsFacade(resultSetProcessor, jdbcDriverOverview);
	}
}
