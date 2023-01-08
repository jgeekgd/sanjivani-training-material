package wrapperclasses;

public class TypeConversionDemo {
	public static void main(String[] args) {

		float f=1.1234567f;// 89123456789123456789;
		System.out.println(f);
		double d=1.123456789123456123456789123456789;
		System.out.println(d);
		
		int i=(int)d;   // Explicit casting Type mismatch: cannot convert from double to int
		System.out.println(i);

		char c=97;  // Implicit casting
		
		System.out.println(c);
		
	}
}
