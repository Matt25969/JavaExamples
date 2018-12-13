
public class Person {

	private String name;
	private String jobTitle;
	private int age;

	public Person(String name, String jobTitle, int age) {

		this.name = name;
		this.setJobTitle(jobTitle);
		this.setAge(age);

	}

	public String getName() {
		return name;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return age + " " + name + " " + jobTitle;
	}

}
