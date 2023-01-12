package generic.style;

public class Main {

	public static void main(String[] args) {
		Printer p = new Printer('A');
		p.print();

		Printer<Integer> intergerPrinter = new Printer<Integer>(10);
		intergerPrinter.print();

		Printer<Double> doublePrinter = new Printer<Double>(20.23);
		doublePrinter.print();

		Printer<String> stringPrinter = new Printer<String>("Thirty");
		stringPrinter.print();
		
		//Below code error as you passing Character instead of String value
		//Printer<String> stringPrinter = new Printer<String>('A');
		//stringPrinter.print();
	}

}
