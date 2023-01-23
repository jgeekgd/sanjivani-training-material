package _interface;

public interface Usb {
	// Illegal modifier for the interface field Usb.privateNormalVariable; only
	// public, static & final are permitted
	// private int privateNormalVariable = 10;
	public static final String FINAL_VARIABLE = "14% Studeet Discount";
	public static long staticNonFinalVariable = 2300000L; // allowed but default its always final
	public int age = 100;

	public abstract void abstractMethod();

	public static void staticMethod() {
		System.out.println(staticNonFinalVariable);
	}

	/*
	 * Multiple markers at this line - Code - Abstract methods do not specify a body
	 * - Illegal modifier for the interface method finalMethod; only public,
	 * private, abstract, default, static and strictfp are permitted public final
	 * void finalMethod() { System.out.println(FINAL_VARIABLE); }
	 */

	public default void normalMethod() {
		System.out.println(staticNonFinalVariable);
	}
}
