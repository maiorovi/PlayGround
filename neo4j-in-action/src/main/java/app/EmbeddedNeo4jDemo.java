package app;

import org.neo4j.graphdb.*;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.io.fs.FileUtils;
import scala.collection.concurrent.KVNode;

import java.io.File;
import java.io.IOException;

public class EmbeddedNeo4jDemo {

	private static final File DB_PATH = new File("D:\\databases\\embedded_neo4j");
	GraphDatabaseService graphDb;
	Node firstNode;
	Node secondNode;
	Relationship relationship;
	public String greeting;


	public static void main(String[] args) throws IOException {
		EmbeddedNeo4jDemo hello = new EmbeddedNeo4jDemo();
		hello.createDb();
		hello.removeData();
		hello.shutDown();
	}

	private void createDb() throws IOException {

		FileUtils.deleteRecursively(DB_PATH);


		graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(DB_PATH);
		registerShutdownHook(graphDb);

		try (Transaction tx = graphDb.beginTx()) {
			firstNode = graphDb.createNode();
			firstNode.setProperty("message", "Hello, ");

			secondNode = graphDb.createNode();
			secondNode.setProperty("message", "Neo4j World");

			relationship = firstNode.createRelationshipTo(secondNode, RelTypes.KNOWS);
			relationship.setProperty("message", "brave neo4j");

			// START SNIPPET: readData
			System.out.print( firstNode.getProperty( "message" ) );
			System.out.print( relationship.getProperty( "message" ) );
			System.out.print( secondNode.getProperty( "message" ) );
			// END SNIPPET: readData

			greeting = ( (String) firstNode.getProperty( "message" ) )
					+ ( (String) relationship.getProperty( "message" ) )
					+ ( (String) secondNode.getProperty( "message" ) );

			// START SNIPPET: transaction
			tx.success();
		}
	}

	private static enum RelTypes implements RelationshipType {
		KNOWS;
	}

	private static void registerShutdownHook(final GraphDatabaseService graphDatabaseService) {

		Runtime.getRuntime().addShutdownHook(new Thread()  {

			@Override
			public void run() {
				graphDatabaseService.shutdown();
			}

		});
	}



	void removeData()
	{
		try ( Transaction tx = graphDb.beginTx() )
		{
			// START SNIPPET: removingData
			// let's remove the data
			firstNode.getSingleRelationship( RelTypes.KNOWS, Direction.OUTGOING ).delete();
			firstNode.delete();
			secondNode.delete();
			// END SNIPPET: removingData

			tx.success();
		}
	}

	void shutDown()
	{
		System.out.println();
		System.out.println( "Shutting down database ..." );
		// START SNIPPET: shutdownServer
		graphDb.shutdown();
		// END SNIPPET: shutdownServer
	}


}
