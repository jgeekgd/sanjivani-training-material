package _05.java8.lambadas;

interface Calculator {
	int operation(int a, int b);
	//int hacker(int a, int b);  //Error: The target type of this expression must be a functional interface
}

//Java Lambda Expression Example: Multiple Parameters
public class Exampl1 {
	public static void main(String[] args) {

		Calculator c1 = (x, y) -> x * y;
		System.out.println(c1.operation(10, 10));
		c1 = (x, y) -> x + y;
		System.out.println(c1.operation(10, 10));
		Calculator add = (a, b) -> a + b;
		System.out.println(add.operation(10, 10));
		Calculator sub = (a, b) -> a - b;
		System.out.println(sub.operation(10, 10));
		Calculator multiply = (a, b) -> a * b;
		System.out.println(multiply.operation(10, 10));
		Calculator devide = (a, b) -> a / b;
		System.out.println(devide.operation(10, 10));
		Calculator mod = (a, b) -> a % b;
		System.out.println(mod.operation(10, 10));
	}
}
