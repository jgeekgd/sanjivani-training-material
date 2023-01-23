package _04java8.interfaces.functionalinterface.collection;

/*
 * Rules.
 * 1. Only one abstract Method
 * 2. We can add as many default methods as we want
 * 3. We can add as many static methods as we want
 * 4. We can have Object class methods too which will not be counted as abstract methods...
 * 
 *  boolean equals(Object obj);         //Because not considered as functional interface abstract method
 *  public String toString();          //Because not considered as functional interface abstract method

 *	Why they allowed Object class methods to be mentioned as abstract--
 *  Because any implementing class will always have implementation inherited from java.lang.Object or elsewhere
 *  
 */

@FunctionalInterface
interface Chat {
	void sms(String msg); // abstract method

	// void sms2(String msg); // this abstract method not allowed

	// It can contain any number of Object class methods.

	int hashCode();

	String toString();

	boolean equals(Object obj);
}

public class FunctionInterfaceDemo implements Chat {
	@Override
	public void sms(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		Chat chat = new FunctionInterfaceDemo();
		chat.sms("Hello there");
		System.out.println(chat);
		System.out.println(chat.hashCode());
		System.out.println(chat.equals(chat));
	}
}
