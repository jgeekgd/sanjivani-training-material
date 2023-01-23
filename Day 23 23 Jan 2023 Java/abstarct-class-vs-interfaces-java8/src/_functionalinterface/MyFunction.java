package _functionalinterface;

@FunctionalInterface
public interface MyFunction {

	public abstract void m1();

	public default void m2() {
		
	}

	public static void m3() {}

	public static void m4() {}

	
}


/**
 * Do we have in jdk any interfaces comprising of single abstarct method?
 * 
 *  interface Comparator  --- single method compare(T o1, T o2)
 *  interface Runnable ----  single method 	run()
 *  
 *  in jdk 1.8 they made the above interface @FunctionalInterface
 * 
 * 
 */

