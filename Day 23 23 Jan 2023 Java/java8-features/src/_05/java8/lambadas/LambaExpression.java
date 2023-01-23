package _05.java8.lambadas;

/**
 * https://www.simonholywell.com/post/the-lambda-calculus/
 *  
 * Java 8 Lambda expression (or function) is an anonymous function. Anonymous
 * function means the function who do not have name and it is not bound to any
 * class.
 * 
 * Lambda expression is the shorter form of method writing.
 * 
 * Using java 8 lambda expression we can remove the obvious and redundant code
 * from functional interface implementation.
 * 
 * Compiler can assume code such as : Class name, method signature, Argument
 * types, return keyword, etc.
 * 
 * Lambda expression is the short way of method writing.
 * 
 * It is indirectly used to implement functional interface Primary Syntax :
 * (parameters) -> { statements; }
 * 
 */

/**
 * https://stacktraceguru.com/java-lambda-expression/
 * 
 * Things to know about Java lambda expressions:
 * 
 * 1.Java 8 lambda expression can have zero, one or any number of arguments
 * 
 * [eg:() -> 10; a -> a*a; (a, b) -> a + b; ]
 * 
 * 2.For zero or more than one arguments parentheses are mandatory
 * 
 * [eg: () ->10; a -> a*a; (a, b) -> a + b; ]
 * 
 * 3. For one argument parentheses are optional
 * 
 * [eg: a -> a*a; OR (a) -> a* b; ]
 * 
 * 4. Arguments type can be declared or auto detected
 * 
 * [eg: (int a, int b) -> a + b; OR (a, b) -> a + b; ]
 * 
 * 5. If we want to declare argument types, parentheses are mandatory
 * 
 * [eg: a -> a * a; (int a) -> a*a; ]
 * 
 * 6. For single line of expression curly brackets are optional
 * 
 * [eg: a -> a*a; OR a -> { return a*a }; ]
 * 
 * 7. For single line of expression return keyword is optional
 * 
 * [eg: a -> a*a; OR a -> { return a*a }; ]
 * 
 * 8. If we add curly brackets return keyword is required
 * 
 * [eg: a -> a*a; OR a -> { return a*a }; ]
 * 
 * 9. Method or class level variables can be used in Lambda expression
 * 
 * 10. Local variables used in Java 8 lambda expressions must be effective final
 * variables ( * A variable or parameter whose value never changes after it is
 * initialized, is effectively final. A variable or parameter declared with the
 * final keyword is final.)
 * 
 * 
 */
public class LambaExpression {

	public static void main(String[] args) {
		/**
		 * 
		 * Local variable x defined in an enclosing scope must be final or effectively
		 * 
		 * https://www.logicbig.com/tutorials/core-java-tutorial/java-8-enhancements/effectively-final.html
		 * 
		 * 'Effectively final' example:
		 * 
		 * String x = "some str";
		 * 
		 * Runnable r = ()-> System.out.println(x+" appended");
		 * 
		 * 
		 * 'Not effectively final' example:
		 * 
		 * Exmaple1:
		 * 
		 * String x = "some str";
		 * 
		 * x = "assinged again";
		 * 
		 * Runnable r = ()-> System.out.println(x+" appended");
		 * 
		 * 
		 * Following will also be an error, even value of x changes after lambda
		 * expression.
		 * 
		 * Exmaple2:
		 * 
		 * String x = "some str";
		 * 
		 * Runnable r = () -> System.out.println(x + " appended");
		 * 
		 * x = "assinged again";
		 * 
		 * 
		 */

		String x1 = "My Initialized Text";
		Runnable r1 = () -> System.out.println(x1 + " appended");
		new Thread(r1).start();

		Runnable r2 = () -> {
			int i = 10; // this variable cannot be declared from inside main method.
			while (i < 15) {
				System.out.println(x1 + "[" + i + "] appended");
				i++;
			}

		};
		new Thread(r2).start();

	}

	/**
	 * 
	 * Since the complier can guess the data type we can remove int data type too
	 *
	 * (int n)->return n*n;
	 * 
	 * (n)->return n*n;
	 * 
	 * If only one argument passed round brackets can be remove.
	 * 
	 * If no argument or two or more arguments parenthesis is must
	 * 
	 * Since after computation value need to be return, return is optional
	 * 
	 * n->return n*n;
	 * 
	 * n->n*n;
	 * 
	 */

	public int square(int n) {
		return n * n;
	}

	// (a,b)->System.out.println(a+b);
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	// ()->System.out.println("Hello");
	public void hello() {
		System.out.println("Hello!");
	}
}
