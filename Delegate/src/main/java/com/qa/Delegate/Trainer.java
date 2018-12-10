package com.qa.Delegate;

public class Trainer extends Employee implements TempInterface {

	public void bespokeTrainerMethod() {

		System.out.println("Bespoke Trainer Method");

	}

	// must be done due to abstract method in interface
	@Override
	public String methodMustBeOveridden() {
		// TODO Auto-generated method stub
		return null;
	}

}
