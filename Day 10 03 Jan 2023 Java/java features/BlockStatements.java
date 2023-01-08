package com.revature.features;

public class BlockStatements {
	public static void main(String[] args) {

		int a = 10;

		{
			int y=20;
			a++;
			System.out.println(y);
		}

		System.out.println(a);
		//System.out.println(y); //not accessible
		
		//		while() {
		//			int x;
		//		}
		//		x 			// not accssible..

	}
}
