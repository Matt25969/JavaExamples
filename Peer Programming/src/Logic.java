import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Logic {

	public String factorial(int arg1) {

		int i = 1;

		int sum = 1;

		while (sum <= arg1) {

			if (sum < arg1) {

				sum = sum * i;

			} else if (sum == arg1) {
				return i - 1 + "!";
			}

			i++;
		}

		return "Number is not a factorial";

	}

	public void doggo(String arg1) {

		List<String> numberList = new ArrayList<>();

		for (int i = 1; i < 101; i++) {
			if (!(arg1.equals(i + ""))) {
				numberList.add(i + "");
			}
		}
		numberList.stream().map(n -> n + "th").map(n -> (n.charAt(0) == '1' && n.length() == 3) ? ("1st") : n)
				.map(n -> (n.charAt(0) == '2' && n.length() == 3) ? ("2nd") : n)
				.map(n -> (n.charAt(0) == '3' && n.length() == 3) ? ("3rd") : n)
				.map(n -> n.charAt(1) == '1' ? (n.charAt(0) + "1st") : n)
				.map(n -> n.charAt(1) == '2' ? (n.charAt(0) + "2nd") : n)
				.map(n -> n.charAt(1) == '3' ? (n.charAt(0) + "3rd") : n).map(n -> n.equals("11st") ? "11th" : n)
				.map(n -> n.equals("12nd") ? "12th" : n).map(n -> n.equals("13rd") ? "13th" : n)
				.collect(Collectors.toList()).forEach(System.out::println);

	}

}
