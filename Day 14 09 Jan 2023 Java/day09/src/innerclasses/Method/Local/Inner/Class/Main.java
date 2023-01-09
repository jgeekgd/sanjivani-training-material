package innerclasses.Method.Local.Inner.Class;

/**
 * 
 * Type 2: Method Local Inner Classes
 * 
 * Inner class can be declared within a method of an outer class which we will
 * be illustrating in the below example where Inner is an inner class in
 * outerMethod().
 *
 * Method Local inner classes can use a local variable of the outer method which
 * are final or effectively final
 * 
 * The concept of Effective final variables is only available from Java 8
 * onward.
 * 
 * A variable is considered an effective final if it is not modified
 * after initialization in the local block.
 * 
 * 
 * The main reason we need to declare a local variable as a final is that the
 * local variable lives on the stack till the method is on the stack but there
 * might be a case the object of the inner class still lives on the heap.
 * 
 * 
 * Method local inner class can’t be marked as private, protected, static, and
 * transient but can be marked as abstract and final, but not both at the same
 * time.
 * 
 * 
 * Uncomment code mentioned with error:xxxx to see error messages.
 * 
 * 
 * A class i.e., created inside a method, is called local inner class in java.
 * Local Inner Classes are the inner classes that are defined inside a block.
 * Generally, this block is a method body. Sometimes this block can be a for
 * loop, or an if clause. Local Inner classes are not a member of any enclosing
 * classes. They belong to the block they are defined within, due to which local
 * inner classes cannot have any access modifiers associated with them. However,
 * they can be marked as final or abstract. These classes have access to the
 * fields of the class enclosing it. If you want to invoke the methods of the
 * local inner class, you must instantiate this class inside the method.
 *
 * 
 * 
 */
class Outer {
	void outerMethod() {
		int x = 98;
		final int z;
		// x+=10; //error: local variables referenced from an inner class must be final or
		// effectively final
		z = x + 31; // This is called effectively final
		System.out.println("inside outerMethod");
		class Inner {
			void innerMethod() {
				//int x=56; // Uncomment & try this too. as this is also local scope.
				//x+=10; // error: local variables referenced from an inner class must be final or
				// effectively final
				System.out.println("x= " + x);
				System.out.println("z= " + z);
			}
		}
		Inner y = new Inner();
		y.innerMethod();
	}
}

public class Main {
	public static void main(String[] args) {
		Outer x = new Outer();
		x.outerMethod();
	}
}
