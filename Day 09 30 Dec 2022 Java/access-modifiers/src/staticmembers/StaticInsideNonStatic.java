package staticmembers;

public class StaticInsideNonStatic {
	// access non static inside staic blockk
	int age = 10;

	private static void whatsAge() {
		StaticInsideNonStatic temp = new StaticInsideNonStatic();
		temp.age++;
		System.out.println(temp.age);
	}

	public static void main(String[] args) {
		whatsAge();
	}
}
