package _04java8.interfaces.functionalinterface.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.logicbig.com/tutorials/core-java-tutorial/java-8-enhancements/effectively-final.html
//https://stacktraceguru.com/overview-java-8-stream-api/#streamCreation

//Java Lambda Expression Example: Foreach Loop
public class Exampl2 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");

		System.out.println("------------ Printing List Like Boss!");
		list.forEach((n) -> System.out.println(n));

		Map<String, Integer> ages = new HashMap<>();
		ages.put("John", 25);
		ages.put("Freddy", 24);
		ages.put("Samuel", 30);

		System.out.println("------------ Printing HashMap Like Boss!");
		ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));
	}
}
