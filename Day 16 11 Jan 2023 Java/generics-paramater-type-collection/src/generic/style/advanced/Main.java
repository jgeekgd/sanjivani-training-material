package generic.style.advanced;

public class Main {

	public static void main(String[] args) {
		Printer p = new Printer(new Animal());
		p.print();

		Printer<Dog> dogPrinter = new Printer<Dog>(new Dog());
		dogPrinter.print();

		Printer<Cat> catPrinter = new Printer<Cat>(new Cat());
		catPrinter.print();
		
		DogPrinter<GermanShepherd> doggy=new DogPrinter<GermanShepherd>(new GermanShepherd ());
		doggy.print();

	}

}
