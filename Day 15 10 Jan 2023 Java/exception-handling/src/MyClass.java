public class MyClass {
	public static void main(String args[]) {
		Animal a = new Dog(); // allowed upward casting
		// Dog dog=new Animal(); // Compiler error not possible
		Dog d = new Dog();
		Animal c = new Cat();
		m1(a);
		m1(d); // Animal a= new Dog();
		m1(c);
	}

	public static void m1(Animal a) {
		if (a instanceof Animal) {
			System.out.println(a);
		}
	}
}

class Cat extends Animal {
}

class Animal {
}

class Dog extends Animal {
}

// Incorrect condtion this must be last else condition 
//if (a instanceof Animal) {
//	System.out.println(a);
//}
