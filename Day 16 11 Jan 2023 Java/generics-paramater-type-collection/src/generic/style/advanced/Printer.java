package generic.style.advanced;

import java.io.Serializable;

// dont do  Printer<T extends Object> becuase its same as  Printer<T>  
public class Printer<T extends Animal> { // Called Bounded Generic
	T value;

	public Printer(T value) {
		super();
		this.value = value;
	}

	public void print() {
		System.out.println(value);
	}

}

class OtherPrinter<T extends Animal & Serializable> { // extends animal and implements Serializable if multiple
														// interfaces you can add & and name of interfaces
}

//Error: The type Animal is not an interface; it cannot be specified as a bounded parameter
//Cause: 1st define class then define  interface as we do in Java
//class AnotherPrinter<T extends Serializable & Animal> { 
//}

//When you do below
//class DogPrinter<T extends Dog,Cat>
//No compilation error in DogPrinter class
//But Main class compilation error:
//Incorrect number of arguments for type DogPrinter<T,Cat>; it cannot be parameterized with arguments <GermanShepherd>
class DogPrinter<T extends Dog> { // extends Dog & Cat not possible in java try T extends Dog,Cat
	T value;

	public DogPrinter(T value) {
		super();
		this.value = value;
	}

	public void print() {
		System.out.println(value);
	}
}