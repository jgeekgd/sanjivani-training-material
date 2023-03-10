package com.revature.features;

public class ArrayInJava {
	public static void main(String[] args) {
		// singleDimensionArray();
		// twoDimensionArray();
		// threeDimensionArray();
		// arrayWithoutName();
		// commandLineArguments(args);

		System.out.println(add("A"));
		System.out.println(add("B", 10));
		System.out.println(add("C", 10, 20));
		System.out.println(add("D", 10, 20, 30));
		System.out.println(add("F", 10, 20, 30, 40));
	}

	public static int add(String user, int... val) { /// Variable Arguments in shorts VAR-ARGS 0... more arguments
		System.out.println("User: " + user);
		int result = 0;
		for (int i = 0; i < val.length; i++) {
			result += val[i];
		}
		return result;
	}

	private static void commandLineArguments(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]" + args[i]);
		}
	}

	private static void arrayWithoutName() {
		String[][] client1 = new String[2][5];
		String[] morningWorkout = new String[] { "Cycling", "Swimming", "Boxing", "Cardio", "Zumba" };
		client1[0] = morningWorkout;
		client1[1] = new String[] { "Walking", "Weigh Training", "Yoga", "Meditation", "Aroma" };

		for (int val : new int[] { 10, 20, 30 }) {
			System.out.println(val);
		}
	}

	private static void threeDimensionArray() {
		int[][][] _3dObject = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
	}

	private static void twoDimensionArray() {
		String[][] timeTable = { { "Cycling", "Swimming", "Boxing", "Cardio", "Zumba" },
				{ "Walking", "Weigh Training", "Yoga", "Meditation", "Aroma" } };

		String[][] clinet1 = new String[2][5];
		String[][] clinet2 = new String[2][5];

		String[][] timeTable2 = { { "Cycling", "Boxing", "Cardio", "Zumba" }, { "Walking", "Yoga", "Swimming" } };
		for (int i = 0; i < timeTable2.length; i++) {
			for (int j = 0; j < timeTable2[i].length; j++) {
				System.out.print(timeTable2[i][j] + "     ");
			}
			System.out.println();
		}
	}

	private static void singleDimensionArray() {
		int age[] = { 10, 20, 30 }; // c programming type delcaration support, initialization, new happens
									// internally
		int[] age2 = { 110, 220, 330 };
		int[] age3 = new int[] { 990, 880, 770 };
		// Impossible: int [] age4 = new int[];
		// Variable must provide either dimension expressions or an array initializer
		int[] age4 = new int[3];

		int i = 0;
		int j = age2.length - 1;
		int k = 0;
		int l = 0;
		for (; i < age.length || j > 0 || k < age3.length || l < age4.length;) {
			System.out.println("Age:" + age[i] + "---------" + "Age2:" + age2[i] + "---------" + "Age3:" + age3[i]
					+ "---------" + "Age4:" + age4[i]);
			i++;
			j--;
			k++;
			l++;
		}
	}
}

//====> java supported looping constructs
//while
//for
//do..while
//for(:)
//forEach()
//itertor

//Primitive Types are stored in stack
//Referecen Types are stored in heap --- object, Array
