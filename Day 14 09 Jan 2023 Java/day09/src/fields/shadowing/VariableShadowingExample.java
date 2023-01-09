package fields.shadowing;

class Parent {
	// Declaring instance variable by name `x`
	String x = "Parent`s Instance Variable";

	public void printInstanceVar() {
		System.out.println(x);
	}

	public void printLocalVar() {
		// Shadowing instance variable `x` by a local variable with same name
		String x = "Local Variable";
		System.out.println(x);

		// If we still want to access instance variable, we do that by using `this.x`
		System.out.println(this.x);
	}
}

class Child extends Parent {

	// Hiding Parent class's variable `x` by defining a variable in child class with
	// same name.
	String x = "Child`s Instance Variable";

	@Override
	public void printInstanceVar() {
		System.out.print(x);

		// If we still want to access variable from super class, we do that by using
		// `super.x`
		System.out.print(", " + super.x + "\n");
	}
}

public class VariableShadowingExample {
	public static void main(String[] args) {
		Parent parent1 = new Parent();
		parent1.printInstanceVar(); // Output - "Parent`s Instance Variable"
		System.out.println(parent1.x); // Output - "Parent`s Instance Variable"

		Child child = new Child();
		child.printInstanceVar();// Output - "Child`s Instance Variable, Parent`s Instance Variable"
		System.out.println(child.x);// Output - "Child`s Instance Variable"

		Parent parent2 = new Child();
		parent2.printInstanceVar();// Output - "Child`s Instance Variable, Parent`s Instance Variable"
		System.out.println(parent2.x);// Output - Parent`s Instance Variable

		// Accessing child's variable from parent's reference by type casting
		System.out.println(((Child) parent2).x);// Output - "Child`s Instance Variable"
	}

}