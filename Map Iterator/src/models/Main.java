package models;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		iteratorReview();

	}

	public static void iteratorReview() {

		HashMap<String, String> map = new HashMap<>();

		map.put("1", "Elliott");
		map.put("2", "Gareth");
		map.put("12", "Dev");

		Iterator<Entry<String, String>> it = map.entrySet().iterator();

		while (it.hasNext()) {
			Entry<String, String> entry = it.next();

			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());

		}

	}

}