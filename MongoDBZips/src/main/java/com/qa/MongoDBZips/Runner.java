package com.qa.MongoDBZips;

public class Runner {

	public static void main(String[] args) {

		Logic log = new Logic();

		log.startCollecion();

		log.printEntireCollection();

		System.out.println(log.collectionQuery("_id", "00001"));

		int[] myArray = { 10, 10 };

		log.insertDocument("00001", "MANCHESTER", myArray, 100, "THIS");

		log.organiseByStateAndFindTotalPop();

		log.printOutPopMap();

		log.closeCollection();

	}

}
