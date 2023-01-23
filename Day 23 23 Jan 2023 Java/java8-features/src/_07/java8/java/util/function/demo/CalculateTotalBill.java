package _07.java8.java.util.function.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BinaryOperator;

public class CalculateTotalBill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Meal Cost:");
		double mealCost = scan.nextDouble(); // original meal price
		System.out.println("Enter Tip Percent %:");
		int tipPercent = scan.nextInt(); // tip percentage
		System.out.println("Enter Service Tax Percent %:");
		int taxPercent = scan.nextInt(); // tax percentage
		scan.close();

		Map<Double, Double> map = new HashMap<>();
		BinaryOperator<Double> opPercent = (t1, t2) -> (t1 * t2) / 100;
		BinaryOperator<Double> opSum = (t1, t2) -> (t1 + t2);
	
		map.put(mealCost, opSum.apply((double) taxPercent, (double) tipPercent));

		calculation(opPercent, map);
	}

	public static void calculation(BinaryOperator<Double> opPercent, Map<Double, Double> map) {
		List<Double> biList = new ArrayList<>();
		map.forEach((s1, s2) -> biList.add(s1 + opPercent.apply(s1, s2)));
		System.out.println("Total bill amount: $"+biList);
	}
}






