public class Chair {

	int weight, temp, number;

	public Chair(int weight, int temp) {
		this.weight = weight;
		this.temp = temp;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public String toString() {
		return weight + " " + temp;
	}

}