
public enum Day {
	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

	private int position;

	private Day(int position) {
		this.position = position;
	}

	public int getPosition() {
		return position;
	}

}
