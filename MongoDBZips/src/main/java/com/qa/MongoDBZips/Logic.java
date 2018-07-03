package com.qa.MongoDBZips;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.DuplicateKeyException;
import com.mongodb.MongoClient;

public class Logic {

	MongoClient mongoClient = null;

	DB database = null;

	DBCollection collection = null;

	Map<String, Integer> popMap = null;

	public void startCollecion() {

		mongoClient = new MongoClient();

		database = mongoClient.getDB("test");

		collection = database.getCollection("zips");

	}

	public void printEntireCollection() {

		DBCursor cursor = collection.find();
		while (cursor.hasNext()) {
			DBObject obj = cursor.next();
			System.out.println(obj);
		}
	}

	public Map<String, Integer> organiseByStateAndFindTotalPop() {

		popMap = new HashMap<String, Integer>();

		DBCursor cursor = collection.find();
		while (cursor.hasNext()) {
			DBObject obj = cursor.next();

			if (popMap.containsKey((String) obj.get("state"))) {

				int tempInt = popMap.get((String) obj.get("state"));

				popMap.put((String) obj.get("state"), (Integer) obj.get("pop") + tempInt);

			} else {

				popMap.put((String) obj.get("state"), (Integer) obj.get("pop"));

			}
		}
		return popMap;

	}

	public void printOutPopMap() {

		Iterator<Entry<String, Integer>> it = popMap.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, Integer> entry = it.next();

			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());

		}

	}

	public DBObject collectionQuery(String key, String value) {

		DBObject query = new BasicDBObject(key, value);
		DBCursor cursor = collection.find(query);
		DBObject returnedObject = cursor.one();
		return returnedObject;

	}

	public void insertDocument(String id, String city, int[] locArray, int pop, String state) {

		DBObject documentToInsert = new BasicDBObject("_id", id).append("city", city).append("loc", locArray)
				.append("pop", pop).append("state", state);

		try {
			collection.insert(documentToInsert);
		} catch (DuplicateKeyException e) {
			System.out.println("Document with this _id already exists");
		}

	}

	public void closeCollection() {

		mongoClient.close();

	}

}
