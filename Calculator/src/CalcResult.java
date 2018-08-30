
public class CalcResult {

	public double inputA;
	public double inputB;
	public double inputAPos;
	public double inputBPos;
	public String operator;
	public double result;
	public boolean valid = false;

	public CalcResult(double input, double input2, int inputAPos, int inputBPos, String operator, double d) {
		super();
		this.inputA = input;
		this.inputB = input2;
		this.inputAPos = inputAPos;
		this.inputBPos = inputBPos;
		this.operator = operator;
		this.result = d;
	}

	@Override
	public String toString() {
		return inputA + " " + inputB + " when they are " + operator + " are equal too " + result;
	}

}
