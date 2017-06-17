package neo4j_driver;

import org.neo4j.driver.v1.*;

import java.util.ArrayList;
import java.util.List;

public class Neo4jJavaDriverDemo {

	public static void main(String[] args) {
		Neo4jJavaDriverDemo driverDemo = new Neo4jJavaDriverDemo();
		driverDemo.createSession();
		driverDemo.readDataAndProcess();
		driverDemo.closeResources();
	}

	private Driver driver;
	private Session session;

	public void createSession() {
		driver = GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic( "neo4j", "neo4j" ));
		session = driver.session();
	}

	public void readDataAndProcess() {
		 StatementResult statementResult = session.run("MATCH (n:Movie) RETURN n.title AS title LIMIT 3");
		 List<String> titles = new ArrayList();

		 while (statementResult.hasNext()) {
		 	Record record = statementResult.next();
		 	titles.add(record.get("title").asString());
		 }

		 titles.forEach(System.out::println);
	}

	public void closeResources() {
		session.close();
		driver.close();
	}
}
