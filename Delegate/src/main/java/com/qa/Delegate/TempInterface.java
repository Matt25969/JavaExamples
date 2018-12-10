package com.qa.Delegate;

public interface TempInterface {

	public int age = 9;

	public default void defMethod() {

		System.out.println("I am a Defender Method");

	};

	public String methodMustBeOveridden();

}
