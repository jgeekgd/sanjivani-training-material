package caution;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		ArrayList<Object> anything = new ArrayList<Object>();
		anything.add(new Dog());
		//anything.add(new Cat());

		Cat myCat = (Cat) anything.get(0);
		System.out.println(myCat);
	}
}

class Dog {

}

class Cat {

}

/**
 * Exception in thread "main" java.lang.ClassCastException: class caution.Dog
 * cannot be cast to class caution.Cat (caution.Dog and caution.Cat are in
 * unnamed module of loader 'app') at caution.Main.main(Main.java:12)
 */