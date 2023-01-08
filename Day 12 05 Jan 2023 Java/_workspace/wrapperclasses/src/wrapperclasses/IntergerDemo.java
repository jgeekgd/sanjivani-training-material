package wrapperclasses;

public class IntergerDemo {
	public static void main(String[] args) {
		Integer i=Integer.parseInt("122");
		Integer a=100;  // Auto Boxing -- Primitve Type to Reference Type Conversion
		System.out.println(++i+a);  // Auto Unboxing Reference Type  to Primitve Type Conversion
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Integer.toString(21).toUpperCase());
		
		double d=1.7976931348623157e308;
	}
}
