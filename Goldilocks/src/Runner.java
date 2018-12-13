import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		Chair goldilocks = new Chair(100, 120);
		Chair chair1 = new Chair(297, 90);
		Chair chair2 = new Chair(66, 110);
		Chair chair3 = new Chair(257, 113);
		Chair chair4 = new Chair(276, 191);
		Chair chair5 = new Chair(280, 129);
		Chair chair6 = new Chair(219, 163);
		Chair chair7 = new Chair(254, 193);
		Chair chair8 = new Chair(86, 153);
		Chair chair9 = new Chair(206, 107);
		Chair chair10 = new Chair(71, 137);
		Chair chair11 = new Chair(98, 40);
		Chair chair12 = new Chair(238, 127);
		Chair chair13 = new Chair(52, 146);
		Chair chair14 = new Chair(129, 197);
		Chair chair15 = new Chair(144, 59);
		Chair chair16 = new Chair(157, 124);
		Chair chair17 = new Chair(210, 59);
		Chair chair18 = new Chair(110, 54);
		Chair chair19 = new Chair(268, 119);
		Chair chair20 = new Chair(261, 121);
		Chair chair21 = new Chair(12, 189);
		Chair chair22 = new Chair(186, 108);
		Chair chair23 = new Chair(174, 21);
		Chair chair24 = new Chair(112, 18);
		Chair chair25 = new Chair(54, 90);
		Chair chair26 = new Chair(174, 52);
		Chair chair27 = new Chair(16, 129);
		Chair chair28 = new Chair(59, 181);
		Chair chair29 = new Chair(290, 123);
		Chair chair30 = new Chair(248, 132);
		ArrayList<Chair> list = new ArrayList<Chair>();
		list.add(chair1);
		list.add(chair2);
		list.add(chair3);
		list.add(chair4);
		list.add(chair5);
		list.add(chair6);
		list.add(chair7);
		list.add(chair8);
		list.add(chair9);
		list.add(chair10);
		list.add(chair11);
		list.add(chair12);
		list.add(chair13);
		list.add(chair14);
		list.add(chair15);
		list.add(chair16);
		list.add(chair17);
		list.add(chair18);
		list.add(chair19);
		list.add(chair20);
		list.add(chair21);
		list.add(chair22);
		list.add(chair23);
		list.add(chair24);
		list.add(chair25);
		list.add(chair26);
		list.add(chair27);
		list.add(chair28);
		list.add(chair29);
		list.add(chair30);
		// IntStream.range(0,list.size()).mapToObj(index -> );
		// list.stream().filter(n -> n.getWeight() >= goldilocks.getWeight() &&
		// n.getTemp() <= goldilocks.getTemp()).forEach(System.out::println);
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getWeight() >= goldilocks.getWeight() && list.get(i).getTemp() <= goldilocks.getTemp())
				System.out.println(i + 1 + " ");
		}
	}

}
