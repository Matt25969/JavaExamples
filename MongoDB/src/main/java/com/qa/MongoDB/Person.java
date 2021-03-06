package com.qa.MongoDB;

public class Person {

	private int UserID;
	private String name;
	private String address;
	private String city;
	private int postcode;

	public Person(int userID, String name, String address, String city, int postcode) {
		super();
		UserID = userID;
		this.name = name;
		this.address = address;
		this.city = city;
		this.postcode = postcode;
	}

	public int getUserID() {
		return UserID;
	}

	public void setUserID(int userID) {
		UserID = userID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Person, UserID=" + UserID + ", name=" + name + ", address=" + address + ", city=" + city + ", postcode="
				+ postcode;
	}

}
