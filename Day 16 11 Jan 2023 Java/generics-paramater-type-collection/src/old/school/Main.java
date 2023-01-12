package old.school;

public class Main {

	public static void main(String[] args) {
		IntegerPrinter integerPrinter = new IntegerPrinter(10);
		integerPrinter.print();

		DoublePrinter doublePrinter = new DoublePrinter(20.23);
		doublePrinter.print();

		StringPrinter stringPrinter = new StringPrinter("Thirty");
		stringPrinter.print();
	}

}
