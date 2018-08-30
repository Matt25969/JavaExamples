import java.util.ArrayList;

public class Logic {

	public static ArrayList<Integer> posList = new ArrayList<>();

	public static void doggo(int pos) {

		for (int i : posList) {

			if (i == pos)
				continue;

			switch (i % 100) {

			case 11:
			case 12:
			case 13:
				System.out.println(i + "th");
				break;
			default:
				switch (i % 10) {

				case 1:
					System.out.println(i + "st");
					break;
				case 2:
					System.out.println(i + "nd");
					break;
				case 3:
					System.out.println(i + "rd");
					break;
				default:
					System.out.println(i + "th");
				}
			}

		}

	}

	public static void popList(int no) {

		for (int i = 0; i < no; i++) {

			posList.add(i);

		}

		System.out.println(posList);

	}

}
