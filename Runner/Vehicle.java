
public abstract class Vehicle {

	private int ID;
	private String make;

	public Vehicle(int ID, String make) {

		this.ID = ID;
		this.make = make;

	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Vehicle [ID=" + ID + ", make=" + make + "]";
	}

}
