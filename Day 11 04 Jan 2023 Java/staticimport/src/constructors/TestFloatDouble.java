package constructors;

public class TestFloatDouble {
	public static void main(String[] args) {

		float f = 1.5f;
		double d = -1.5f;

		System.out.println((f == d) ? "f==d" : "f!=d");

		f = 1.1234567123456789123456789f;
		d = 1.123456789123456789123456789d;
		// d = 1.123456700f;
		System.out.println(f);
		System.out.println(d);

		System.out.println((f == d) ? "f==d" : "f!=d");

		// Print float to 15 decimal places using printf
		System.out.printf("Float upto 15 decimal places: %.15f\n", f);
		System.out.printf("Double upto 15 decimal places: %.15f", d);

	}

}
