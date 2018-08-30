
public class Bike extends Vehicle {

	private String name;

	public Bike(int ID, String make, String name) {

		super(ID, make);

		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
