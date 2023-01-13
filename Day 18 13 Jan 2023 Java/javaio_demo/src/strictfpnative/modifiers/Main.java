package strictfpnative.modifiers;

/**
 * 
 * strictfp is a modifier that stands for strict floating-point which was not
 * introduced in the base version of java as it was introduced in Java version
 * 1.2. It is used in java for restricting floating-point calculations and
 * ensuring the same result on every platform while performing operations in the
 * floating-point variable. Floating-point calculations are platform-dependent
 * i.e. different output(floating-point values) is achieved when a class file is
 * run on different platforms(16/32/64 bit processors). To solve this type of
 * issue, strictfp keyword was introduced in JDK 1.2 version by following IEEE
 * 754 standards for floating-point calculations
 *
 *
 * Some conclusions can be drawn from the above illustrations as follows:
 * 
 * When a class or an interface is declared with strictfp modifier, then all
 * methods declared in the class/interface, and all nested types declared in the
 * class, are implicitly strictfp. strictfp cannot be used with abstract
 * methods. However, it can be used with abstract classes/interfaces. Since
 * methods of an interface are implicitly abstract, strictfp cannot be used with
 * any method inside an interface. 
 * 
 * 
 * From Java 17 version, strictfp keyword is NOT
 * required explicitly as all floating point expressions are strictly evaluated
 * 
 */
//Java program to illustrate strictfp modifier
//Usage in Classes

//Main class
class GFG {

	// Method 1
	// Calculating sum using strictfp modifier
	public strictfp double sum() {

		double num1 = 10e+10;
		double num2 = 6e+08;

		// Returning the sum
		return (num1 + num2);
	}

	// Method 2
	// Main driver method
	public static void main(String[] args) {

		// Creating object of class in main() method
		GFG t = new GFG();

		// Here we have error of putting strictfp and
		// error is not found public static void main method
		System.out.println(t.sum());
	}
}
