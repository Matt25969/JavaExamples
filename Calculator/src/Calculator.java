import java.util.ArrayList;

public class Calculator {

	ArrayList<CalcResult> resultList = new ArrayList<CalcResult>();

	public void flexCalc(double[] input) {

		CalcResult cr = null;

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length; j++) {

				if (i == j)
					continue;

				cr = new CalcResult(input[i], input[j], i, j, "*", mult(input[i], input[j]));
				resultList.add(cr);
				cr = new CalcResult(input[i], input[j], i, j, "/", div(input[i], input[j]));
				resultList.add(cr);
				cr = new CalcResult(input[i], input[j], i, j, "-", sub(input[i], input[j]));
				resultList.add(cr);
				cr = new CalcResult(input[i], input[j], i, j, "+", add(input[i], input[j]));
				resultList.add(cr);

			}
			// i is the point we have compared mainly

			for (CalcResult ccr : resultList) {
				for (int ic = 0; ic < input.length; ic++) {

					if (ccr.result == input[ic] && ic != ccr.inputAPos && ic != ccr.inputBPos) {
						ccr.valid = true;
						// System.out.println(ccr);
					}
				}

				// at this point the list will contain every permutation of the first int
				// with every other one - emphasis on one

			}

			ArrayList<CalcResult> tempList = new ArrayList<>();

			for (CalcResult ccr : resultList) {

				if (!(ccr.valid)) {
					tempList.add(ccr);

				}
			}

			resultList.removeAll(tempList);

		}

		for (CalcResult ccr : resultList) {

			System.out.println(ccr);
		}
	}

	public double mult(double input, double input2) {

		return input * input2;

	}

	public double div(double input, double input2) {

		return input / input2;

	}

	public double add(double input, double input2) {

		return input + input2;

	}

	public double sub(double input, double input2) {

		return input - input2;

	}

}
