package com.qa.MongoDB;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.DuplicateKeyException;
import com.mongodb.MongoClient;

public class Runner {

	public static void main(String[] args) {

		System.out.println("---------------------------------------------");
		System.out.println("Creating connection to Database and Inserting Document into Collection");
		System.out.println("---------------------------------------------");

		MongoClient mongoClient = new MongoClient();

		DB database = mongoClient.getDB("test");

		DBCollection collection = database.getCollection("Person");

		DBObject person1 = new BasicDBObject("_id", 0001).append("name", "Bert Smith").append("address", "123 Fake St")
				.append("city", "Manchester").append("postcode", 12345);

		try {
			collection.insert(person1);
		} catch (DuplicateKeyException e) {
			System.out.println("Document with this _id already exists");
		}
		System.out.println("---------------------------------------------");
		System.out.println("Finished Inserting Document into Collection");
		System.out.println("---------------------------------------------");

		System.out.println("---------------------------------------------");
		System.out.println("Accessing Database in Order to Create a Person Object");
		System.out.println("---------------------------------------------");

		DBObject query = new BasicDBObject("_id", 0001);
		DBCursor cursor = collection.find(query);
		DBObject returnedObject = cursor.one();

		Person p1 = new Person((Integer) returnedObject.get("_id"), (String) returnedObject.get("name"),
				(String) returnedObject.get("address"), (String) returnedObject.get("city"),
				(Integer) returnedObject.get("postcode"));
		System.out.println();
		System.out.println(p1.toString());
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("Finished Querying Collection");
		System.out.println("---------------------------------------------");

		mongoClient.close();

	}

}
