package fields.shadowing;

public class Main {

	public static void main(String[] args) {
		D d = new D();

		System.out.println(d.i); // 66
		System.out.println(d.f()); // -66
		System.out.println(d.superf()); // 12
		System.out.println(d.superi()); // 6
		System.out.println(d.bcasti()); // 6

		B b = (B) d;

		/**
		 * This is variable hiding - "When an instance variable in a subclass has the
		 * same name as an instance variable in a super class, then the instance
		 * variable is chosen from the reference type."
		 */
		System.out.println(b.i); // 6

		/**
		 * This is method overriding - "(...) overridden methods completely replace the
		 * inherited methods, so when we try to access the method from a parent's
		 * reference by holding a child's object, the method from the child class gets
		 * called."
		 */
		System.out.println(b.f()); // -66
	}

}

/*
 * Java allows us to declare a variable whenever we need it. We can categorize
 * all our variables into three categories, which have different-different
 * scopes:
 * 
 * Instance variables: defined inside a class and have object-level scope.
 * 
 * Class variables: defined inside a class with the static keyword. They have
 * class-level scope common to all objects of the same class.
 * 
 * Local variables: defined inside a method or in any conditional block. They
 * have block-level scope and are only accessible in the block where they are
 * defined.
 */

/*
 * What Is Variable Shadowing?
 * 
 * Variable shadowing happens when we define a variable in a closure scope with
 * a variable name that is the same as one for a variable we've already defined
 * in an outer scope. In other words, when a local variable has the same name as
 * one of the instance variables, the local variable shadows the instance
 * variable inside the method block.
 * 
 * What Is variable Hiding?
 * 
 * Variable hiding happens when we define a variable in a child class with the
 * same name as one we defined in the parent class. A child class can declare a
 * variable with the same name as an inherited variable from its parent class,
 * thus hiding the inherited variable. In other words, when the child and parent
 * classes both have a variable with the same name, the child class' variable
 * hides the parent class' variable.
 * 
 * 
 * Variable Hiding Is Not the Same as Method Overriding
 * 
 * While variable hiding looks like overriding a variable (similar to method
 * overriding), it is not. Overriding is applicable only to methods while hiding
 * is applicable to variables In the case of method overriding, overridden
 * methods completely replace the inherited methods, so when we try to access
 * the method from a parent's reference by holding a child's object, the method
 * from the child class gets called. But in variable hiding, the child class
 * hides the inherited variables instead of replacing them, so when we try to
 * access the variable from the parent's reference by holding the child's
 * object, it will be accessed from the parent class.
 * 
 */
