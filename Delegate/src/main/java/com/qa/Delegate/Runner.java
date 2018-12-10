package com.qa.Delegate;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		String s1 = "Hello";

		Delegate d1 = new Delegate("Bert");

		Delegate aDifferentDelegate = new Delegate("Jeff");

		d1.remove();

		aDifferentDelegate.changeStream();

		System.out.println(d1.name);

		d1.name = "Matt";

		System.out.println(d1.name);

		System.out.println(aDifferentDelegate.techSkills);

		aDifferentDelegate.techSkills = 9;

		System.out.println(aDifferentDelegate.techSkills);

		// Why we use Encapsulation
		d1.techSkills = 7;

		for (; d1.techSkills < 10; d1.techSkills++) {

			System.out.println(d1.name);

		}

		System.out.println(d1.techSkills);

		ArrayList<Employee> empList = new ArrayList<Employee>();

		Trainer t1 = new Trainer();

		empList.add(d1);
		empList.add(aDifferentDelegate);
		empList.add(t1);

		// casting
		empList.stream().filter(e -> e instanceof Trainer).forEach(e -> e.sharedMethod());

		for (Employee e : empList) {

			if (e instanceof Trainer) {

				((Trainer) e).bespokeTrainerMethod();

			} else if (e instanceof Delegate) {

				((Delegate) e).changeStream();

			}

		}

		t1.defMethod();

		System.out.println(t1.age);

		// cant work because age is final
		// t1.age = 10;

	}

}
