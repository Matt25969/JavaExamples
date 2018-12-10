package com.qa.Delegate;

public class Delegate extends Employee {

	public int techSkills;

	private int softSkills;

	public String name;

	public Delegate(String name) {

		this.name = name;

	}

	public void remove() {

		System.out.println("Delegate was removed");

	}

	public void changeStream() {

		System.out.println("Delegate has changed streams");

	}

}
