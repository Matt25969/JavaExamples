
public class EnumTest {

	Day day;

	boolean bool = false;

	public EnumTest(Day day) {

		this.day = day;

		String s = "true";

		bool = Boolean.parseBoolean(s);

		System.out.println(bool);
	}

	public void tellItLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad.");
			System.out.println(day.getPosition());
			break;

		case FRIDAY:
			System.out.println("Fridays are better.");
			System.out.println(day.getPosition());
			break;

		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			System.out.println(day.getPosition());
			break;

		default:
			System.out.println("Midweek days are so-so.");
			System.out.println(day.getPosition());
			break;
		}
	}

	public void secondEnumTest(Day day) {
		System.out.println(day.getPosition());
		System.out.println(day.getDeclaringClass());
		System.out.println(day.getClass().getSimpleName());

	}
}
