
public class Bus extends Vehicle {

	private boolean hasSeatbelts;

	public Bus(int ID, String make) {
		super(ID, make);
		// TODO Auto-generated constructor stub
	}

	public boolean isHasSeatbelts() {
		return hasSeatbelts;
	}

	public void setHasSeatbelts(boolean hasSeatbelts) {
		this.hasSeatbelts = hasSeatbelts;
	}

}
