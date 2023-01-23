package _02java8.interfaces.staticmethods;

public class OverridStaticMethodInJava {
	public static void main(String args[]) {
		ParentClass pc = new ChildClass();
		// calling display() method by parent class object

		// STATIC METHODS SHOULD BE (NO MUST BE) CALLED WITH CLASSNAME DOT METHOD NAME
		// THERE IS NO COMPILATION ERROR EVEN THOUGH YOU CALL STATIC METHOD USING OBJECT
		// DOT METHOD NAME

		pc.display();

		ParentClass.display(); 

		ChildClass cc1 = new ChildClass();
		cc1.display();
	}
}

// parent class
abstract class ParentClass {
	/**
	 * Static variables are passed to child classes like normal variable and normal
	 * methods.
	 * 
	 * Though the variables are passed not all are accessible due to there access
	 * modifiers?
	 * 
	 */

	protected static String parentAsset = "MAREUTI 800";

	/**
	 * We cannot override the display() method
	 * 
	 * Rule... Static Methods are never passed to child classes as they are class
	 * level methods
	 * 
	 */

	public static void display() {
		System.out.println("display() method of the parent class: (" + parentAsset + ")");
	}

	/*
	 * The abstract method bye in type ParentClass can only set a visibility
	 * modifier, one of public or protected
	 * 
	 * 
	 * public static abstract void bye();
	 * 
	 * 
	 * NOTE: final methods to child class- though passed but can never be overridden
	 * static methods to child class- never passed to child hence no question of
	 * overriding it.
	 * 
	 * 
	 */

}

// child class
class ChildClass extends ParentClass {
	public static String childAsset = "BMW X3";
	// the same method also exists in the ParentClass
	// it does not override, actually it is method hiding

	/*
	 * if you try to put this annoation you will get compile error as
	 * 
	 * @Override The method display() of type ChildClass must override or implement
	 * a supertype method
	 * 
	 */

	// This is not overridden method rather a new method defined in side ChildClass
	// independent of parent class method...
	public static void display() {
		System.out.println("Overridden static method in Child Class in Java: (" + childAsset + ") -- No Static Methods Cant be Overriden By Child");
		System.out.println(
				"Can I access Parent Asset Variable, yes no need for class name becuase variable passed to child class: ("
						+ parentAsset + ")");
		System.out.println("Can I access Parent Asset Method, yes but access with ParentClassName.methodName()");
		ParentClass.display();
	}
}