
public class SingletonExample {

	static private SingletonExample Ref;

	int integerVar = 123;

	private SingletonExample(int arg) {

		this.integerVar = arg;

	}

	public static SingletonExample createSomething(int arg) {

		if (Ref == null) {

			Ref = new SingletonExample(arg);

		}

		return Ref;

	}

	public String toStringNotOverwritten() {
		return "SingletonExample [integerVar=" + integerVar + "]";
	}

}
