
public class Car extends Vehicle {

	private int numberOfSeats;

	public Car(int ID, String make) {
		super(ID, make);
		// TODO Auto-generated constructor stub
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

}
