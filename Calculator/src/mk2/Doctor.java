package mk2;

import java.util.ArrayList;

public class Doctor {

	public void doctorResult(double[] input) {

		ArrayList<UpperValue> uvList = new ArrayList<>();

		for (int i = 0; i < input.length; i++) {

			for (int j = 0; j < input.length; j++) {

				if (i == j)
					continue;

				UpperValue tempUV = new UpperValue();

				tempUV.inA = input[i];
				tempUV.inB = input[j];

				tempUV.result[0] = mult(input[i], input[j]);
				tempUV.result[1] = div(input[i], input[j]);
				tempUV.result[2] = add(input[i], input[j]);
				tempUV.result[3] = sub(input[i], input[j]);

				uvList.add(tempUV);

			}
		}

		furtherDoctor(uvList, input);

	}

	public void furtherDoctor(ArrayList<UpperValue> uvList, double[] input) {

		// if the list is input.size * input.size - 1 the list is complete for multiple

		for (UpperValue uv : uvList) {
			for (int i = 0; i < uv.result.length; i++) {
				// for (double db : uv.result) {
				for (double db2 : input) {
					if (db2 == uv.result[i]) {

						switch (i) {
						case 0:
							System.out.println(uv.inA + " * " + uv.inB + " = " + uv.result[i]);
							break;
						case 1:
							System.out.println(uv.inA + " / " + uv.inB + " = " + uv.result[i]);
							break;
						case 2:
							System.out.println(uv.inA + " + " + uv.inB + " = " + uv.result[i]);
							break;
						case 3:
							System.out.println(uv.inA + " - " + uv.inB + " = " + uv.result[i]);
							break;
						}
					}
				}
			}
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
