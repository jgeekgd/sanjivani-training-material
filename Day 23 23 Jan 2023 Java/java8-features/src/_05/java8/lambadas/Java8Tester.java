package _05.java8.lambadas;

public class Java8Tester {
	public static void main(String args[]) {
		Java8Tester tester = new Java8Tester();

		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;

		
		// with out type declaration
		MathOperation modulo= (a, b) -> a % b;

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		System.out.println("10 % 3 = " + tester.operate(10, 3, modulo));

		// with parenthesis
		GreetingService greetService1 = message -> System.out.println("Hello " + message);

		// without parenthesis
		GreetingService greetService2 = (message) -> System.out.println("Eat " + message);

		greetService1.sayMessage("Ramesh, Suresh");
		greetService2.sayMessage("Five Star!");
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}