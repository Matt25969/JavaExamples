
public class Runner {

	public static void main(String[] args) {

		Bike b1 = new Bike(1, "Red", "Bert");
		Car c1 = new Car(2, "Rover");
		Bus bb1 = new Bus(3, "Big");

		Garage g1 = new Garage();

		g1.getVehicleList().add(b1);

		g1.getVehicleList().add(c1);

		g1.getVehicleList().add(bb1);

		for (Vehicle v : g1.getVehicleList()) {

			System.out.println(v);

		}

	}

}
