package _07.java8.java.util.function.demo;

import java.util.function.BinaryOperator;

/**
 * 
 * BinaryOperator
 * 
 * The Java BinaryOperator interface is a functional interface that represents
 * an operation which takes two parameters and returns a single value.
 * 
 * Both parameters and the return type must be of the same type.
 * 
 * The Java BinaryOperator interface is useful when implementing functions that
 * sum, subtract, divide, multiply etc. two elements of the same type, and
 * returns a third element of the same type.
 * 
 * BinaryOperator<MyValue> binaryOperator = (value1, value2) -> {
 * value1.add(value2); return value1; };
 * 
 * Here is an example implementation of the BinaryOperator interface:
 * 
 * This functional interface which takes in one generic namely:-
 * 
 * BinaryOperator<T>
 * 
 * T: denotes the type of the input arguments and the return value of the
 * operation The BinaryOperator<T> extends the BiFunction<T, T, T> type. So it
 * inherits the following methods from the BiFunction Interface:
 * 
 * apply(T t, T u)
 * 
 * Use BiFunction: What distinguishes BinaryOperator from a normal BiFunciton is
 * that both of its arguments and its return type are same.
 *
 */

class Rgb {
	private int r;
	private int g;
	private int b;

	public Rgb() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rgb(int r, int g, int b) {
		super();
		this.r = r;
		this.g = g;
		this.b = b;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Rgb [r=" + r + ", g=" + g + ", b=" + b + "]";
	}

	// (rgb values are 0-255)
	public Rgb add(Rgb c2) {
		Rgb result = new Rgb();
		result.r = Math.round((1 - (1 - this.r / 255) * (1 - c2.r / 255)) * 255);
		result.g = Math.round((1 - (1 - this.g / 255) * (1 - c2.g / 255)) * 255);
		result.b = Math.round((1 - (1 - this.b / 255) * (1 - c2.b / 255)) * 255);
		return result;
	}

}

class ColorOperation implements BinaryOperator<Rgb> {
	@Override
	public Rgb apply(Rgb t, Rgb u) {
		// TODO Auto-generated method stub
		return null;
	}

}

public class ActivityBinaryOperator {
	public static void main(String[] args) {

		// class Rgb (r,g,b) value object
		BinaryOperator<Rgb> newColor = (color1, color2) -> (color1.add(color2));
		Rgb red = new Rgb(255, 0, 0);
		Rgb green = new Rgb(0, 255, 0);
		Rgb yellow = newColor.apply(red, green);
		System.out.println(yellow);
	}
}








