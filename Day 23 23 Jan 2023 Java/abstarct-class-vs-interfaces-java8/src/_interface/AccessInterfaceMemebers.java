package _interface;

public class AccessInterfaceMemebers {
	public static void main(String[] args) {
		// Usb.FINAL_VARIABLE="40% off";
		// System.out.println(Usb.FINAL_VARIABLE);

		// Usb.staticNonFinalVariable=100L;
		// System.out.println(Usb.staticNonFinalVariable);

		// Usb.age=300;
		// System.out.println(Usb.age);

		/**
		 * Rule: All memeber variables in interface are by default public static final.
		 * 
		 * If you mentioned anything apart from public its compilation error
		 * 
		 * If we do not mentioned static and final for member variables its ok but by
		 * default it is treated as final static
		 * 
		 * You will get error if you try to modify any memeber variable value: The final
		 * field Usb.age cannot be assigned
		 * 
		 * 
		 * Interfaces cannot have constructors
		 * 
		 * Abstract Methods allowed all version till date
		 * 
		 * Interfaces can have static methods with body (from jdk 1.8 onwards)
		 * 
		 * NOTE: Rememeber we cannot have static method abstract becuase they are not
		 * overriddable.
		 * 
		 * Static methods inside interfaces provide unmodifiable/overridable common
		 * functionaliy to all child classes.
		 * 
		 * 
		 * We cannot have final methods inside interface, if we defined we get below
		 * error:
		 * 
		 * Multiple markers at this line
		 * 
		 * - Code
		 * 
		 * - Abstract methods do not specify a body
		 * 
		 * - Illegal modifier for the interface method finalMethod; only public,
		 * private, abstract, default, static and strictfp are permitted
		 * 
		 * 
		 * We cannot have non abstract(normal) methods inside interface
		 * 
		 * 
		 * We can have default methods inside interface (Only from jdk 1.8)
		 * 
		 * Default methods are only allowed inside Interface not abstract classes
		 * If you accidently add default modifier to methods in non interface types you get below error:
		 * 
		 * Multiple markers at this line
		 * 
		 * - Duplicate method normalMethod() in type MicrosoftOffice
		 * 
		 * - Default methods are allowed only in interfaces.
		 * 
		 * 
		 */

	}
}
